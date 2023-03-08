# ProductAssistBot

This is a simple chatbot application built with Java and Spring Boot.

## Features

- Responds to user messages with pre-defined answers.
- Can be trained on new data to improve its responses.

## File Structure

```├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── org/
│   │   │   │   ├── productx/
│   │   │   │   │   ├── ChatbotApplication.java      # main class
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├──ChatbotController.java    # controller class
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├──ChatbotService.java       # service class
│   │   ├── resources/
│   │   │   ├── application.properties               # configuration file
│   │   │   └── static/
│   │   │       ├── chat.html                        # HTML file for chat page
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── ChatbotControllerTest.java   # test class for controller
│   │               └── ChatbotServiceTest.java      # test class for service
├── build.gradle                                     # Gradle configuration file
├── settings.gradle                                  # Gradle settings file
```
## Installation

1. Clone the repository: `git clone https://github.com/KavidiDeSilva/ProductAssistBot.git`
2. Build the project: `./gradlew clean build`

## Usage

1. Navigate to current folder `cd folder_path`
2. Start the application: `java -jar ProductAssistBot.jar`
3. Open a web browser and navigate to `http://localhost:8080/`

## Contributing

Please follow the [contribution guidelines](CONTRIBUTING.md) when submitting code changes.
Also, please be sure to change the `API_KEY` value in `ChatGPTClient.java` to your own ChatGPT API key before testing or deploying the application.

## Credits

- [Spring Boot](https://spring.io/projects/spring-boot)
- [OpenAI API](https://openai.com/api/)
- [Bootstrap](https://getbootstrap.com/)



