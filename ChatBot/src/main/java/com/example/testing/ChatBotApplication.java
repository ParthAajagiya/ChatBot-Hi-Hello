package com.example.testing;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.testing.ServiceImpl.MethodsIMPL;

@SpringBootApplication
@ComponentScan
public class ChatBotApplication {

	@Autowired
	private MethodsIMPL impl;

	public static void main(String[] args) throws BeansException, InterruptedException {
		  org.springframework.context.ApplicationContext context = SpringApplication.run(ChatBotApplication.class, args);
	        ChatBotApplication chat = context.getBean(ChatBotApplication.class);
		System.out.println("Hello! How can i help you?");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		boolean check = chat.impl.containsKeyword(userInput);
		
		chat.impl.checkInput(check);
	}

}
