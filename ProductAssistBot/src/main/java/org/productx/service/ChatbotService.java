package org.productx.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class ChatbotService {

    private static final String API_ENDPOINT = "https://api.openai.com/v1/completions";
    private static final String API_KEY = "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"; // Replace with your API key

    public String getChatbotResponse(String userInput) {
        try {
            // Build request body JSON
            JSONObject requestBody = new JSONObject();
            requestBody.put("model", "text-davinci-003");
            requestBody.put("prompt", userInput);
            requestBody.put("max_tokens", 64);
            requestBody.put("temperature", 0.5);

            // Create HTTP connection and set headers
            URL url = new URL(API_ENDPOINT);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + API_KEY);

            // Send request body
            conn.setDoOutput(true);
            conn.getOutputStream().write(requestBody.toString().getBytes("UTF-8"));
            conn.getOutputStream().flush();

            // Read response from API
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Parse response JSON and return text
            JSONObject jsonResponse = new JSONObject(response.toString());
            return jsonResponse.getJSONArray("choices").getJSONObject(0).getString("text");
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof UnsupportedEncodingException) {
                return "Sorry, there was a problem encoding your input.";
            } else if (e instanceof MalformedURLException) {
                return "Sorry, there was a problem building the API request URL.";
            } else if (e instanceof IOException) {
                return "Sorry, there was a problem sending or receiving data from the API.";
            } else if (e instanceof JSONException) {
                return "Sorry, there was a problem parsing the response from the API.";
            } else {
                return "Sorry, there was an unknown error.";
            }
        }
    }

}
