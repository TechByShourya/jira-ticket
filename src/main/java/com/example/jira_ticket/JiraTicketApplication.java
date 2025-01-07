package com.example.jira_ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JiraTicketApplication {
	public static void main(String[] args) {
		SpringApplication.run(JiraTicketApplication.class, args);
	}
	public static void sum(){
		int a =2,b=3;
		System.out.println(a+b);
	}
}




