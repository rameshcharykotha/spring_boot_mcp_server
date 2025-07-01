package com.java2practice.mcp_server.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Tool(description = "Get Books by their title")
    Book getBooksByTitle(String articleTitle) {
        return new Book("Refactoring", "Martin Fowler");
    }

    @Tool(description = "Get top rated Books with authors")
    List<Book> getTopBooks() {
        return List.of(
                new Book("Clean Code", "Bob Martin"),
                new Book("Micro Services patterns", "Chris Richardson")
        );
    }

    record Book(String title, String author) {
    }
}
