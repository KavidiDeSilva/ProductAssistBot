# ProductAssistBot

ProductAssistBot is a chatbot application built using Java, Spring Boot, and OpenAI's GPT-3 API. It provides an interface for users to chat with the bot and receive information about various products.

## Features

- Responds to user messages with pre-defined answers.
- Can be trained on new data to improve its responses.

![photo_2023-03-10_17-35-40s](https://user-images.githubusercontent.com/40288071/224312266-57dca1e1-2bdc-43a4-b1e4-e7607231e01f.jpg)


## File Structure

```├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── org/
│   │   │   │   ├── productx/
│   │   │   │   │   ├── ProductAssistBotApplication.java      # main class
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├──ProductController.java             # controller class
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├──ChatbotService.java                # service class
│   │   ├── resources/
│   │   │   ├── application.properties                        # configuration file
│   │   │   └── static/
│   │   │       ├── index.html                                # HTML file for chat page
│   ├── test/
│   │   └── java/
│   │       └── org/
│   │           └── productx/
├── build.gradle                                              # Gradle configuration file
├── settings.gradle                                           # Gradle settings file
```
## Installation
To install ProductAssistBot, follow these steps:

1. Clone the repository: `git clone https://github.com/KavidiDeSilva/ProductAssistBot.git`
2. Register for an API key on the OpenAI website
3. Build the project: `./gradlew clean build`
4. Update the API_KEY value in `ChatbotService.java` and `application.properties` to your own OpenAI API key.
5. Start the application: `java -jar ProductAssistBot.jar`
6. Open a web browser and navigate to `http://localhost:8080/`

## Usage
Enter a message in the chat interface and press Enter to receive a response from the chatbot. The chatbot will use the GPT-3 API to generate a response based on the user's input.

## Contributing

Please follow the [contribution guidelines](CONTRIBUTING.md) when submitting code changes.

## Credits

- [Spring Boot](https://spring.io/projects/spring-boot)
- [OpenAI API](https://openai.com/api/)
- [Bootstrap](https://getbootstrap.com/)

Thank you for using ProductAssistBot!

