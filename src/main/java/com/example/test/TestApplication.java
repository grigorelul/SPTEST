package com.example.test;

import com.example.test.model.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		List<Message> messages = new ArrayList<>();
		//SpringApplication.run(TestApplication.class, args);

		try {
			messages = new ObjectMapper().readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>(){});
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		for (Message message : messages) {
			String result = message.decode();
			System.out.println(result);
		}
	}

}
