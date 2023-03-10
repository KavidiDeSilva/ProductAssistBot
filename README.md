# ProductAssistBot

This is a simple chatbot application built with Java and Spring Boot.

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
To install ProductAssistBot, follow these steps:

1. Clone the repository: `git clone https://github.com/KavidiDeSilva/ProductAssistBot.git`
2. Build the project: `./gradlew clean build`
3. Update the API_KEY value in `ChatbotService.java` and `application.properties` to your own OpenAI API key.
4. Start the application: `java -jar ProductAssistBot.jar`
5. Open a web browser and navigate to `http://localhost:8080/`

## Contributing

Please follow the [contribution guidelines](CONTRIBUTING.md) when submitting code changes.

## Credits

- [Spring Boot](https://spring.io/projects/spring-boot)
- [OpenAI API](https://openai.com/api/)
- [Bootstrap](https://getbootstrap.com/)

Thank you for using ProductAssistBot!

