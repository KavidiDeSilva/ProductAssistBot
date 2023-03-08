package org.productx.controller;

import org.productx.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ChatbotService chatbotService;

    @Autowired
    public ProductController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/assist")
    public ResponseEntity<String> assist(@RequestBody String userInput) {
        if (userInput == null || userInput.isEmpty()) {
            return ResponseEntity.badRequest().body("Error: Empty user input");
        }
        String response = chatbotService.getChatbotResponse(userInput);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam("message") String message) {
        if (message == null || message.isEmpty()) {
            return ResponseEntity.badRequest().body("Error: Empty message");
        }
        String response = chatbotService.getChatbotResponse(message);
        return ResponseEntity.ok(response);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<String> handleMissingParamException(MissingServletRequestParameterException ex) {
        String paramName = ex.getParameterName();
        String errorMessage = "Error: Required request parameter '" + paramName + "' is not present";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
