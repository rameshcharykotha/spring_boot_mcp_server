package com.java2practice.mcp_server;

import com.java2practice.mcp_server.service.BookService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.print.Book;

@SpringBootApplication
public class McpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpServerApplication.class, args);
	}

	@Bean
	ToolCallbackProvider authorTools(BookService bookService) {
		return MethodToolCallbackProvider
				.builder()
				.toolObjects(bookService)
				.build();
	}
}
