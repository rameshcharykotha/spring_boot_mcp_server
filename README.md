# Spring Boot MCP Server

## Description

This project is a Spring Boot application that utilizes Spring AI to expose functionalities related to book information. It acts as an "MCP (Model Control Program) Server" where AI models can invoke specific tools to retrieve data, such as finding books by title or getting a list of top-rated books.

The server uses a `BookService` which currently provides hardcoded book data. This setup demonstrates the tool-calling capabilities of Spring AI.

## Prerequisites

Before you begin, ensure you have met the following requirements:

*   **Java Development Kit (JDK):** Version 24 or higher
*   **Apache Maven:** Version 3.6.x or higher

## Getting Started

To get a local copy up and running, follow these simple steps:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/rameshcharykotha/spring_boot_mcp_server.git
    cd spring_boot_mcp_server
    ```

2.  **Build the project:**
    This command will compile the source code and package it into a JAR file.
    ```bash
    mvn clean install
    ```

## Running the Application

You can run the application using Maven or by executing the packaged JAR file:

*   **Using Maven:**
    ```bash
    mvn spring-boot:run
    ```

*   **Using the JAR file:**
    After building the project, navigate to the `target` directory and run the JAR file.
    ```bash
    java -jar target/mcp-server-0.0.1-SNAPSHOT.jar
    ```

Once started, the application will be running and ready to interact with via Spring AI client applications configured to use its exposed tools.

## How It Works

The core of this application is the `McpServerApplication.java`, which initializes Spring Boot and configures Spring AI.

It defines a `ToolCallbackProvider` bean that registers methods from `BookService.java` as callable tools for an AI model. The `BookService` contains methods like:
*   `getBooksByTitle(String articleTitle)`: Fetches a book by its title.
*   `getTopBooks()`: Retrieves a list of top-rated books.

Currently, these service methods return hardcoded data for demonstration purposes.

## Built With

*   [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications.
*   [Spring AI](https://spring.io/projects/spring-ai) - Framework for AI engineering, enabling tool calling.
*   [Apache Maven](https://maven.apache.org/) - Dependency management and build tool.
