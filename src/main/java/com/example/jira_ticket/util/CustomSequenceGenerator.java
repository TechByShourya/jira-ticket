package com.example.jira_ticket.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomSequenceGenerator {

    private static final SecureRandom r = new SecureRandom();

    public static Long generateValue() {
        return Long.valueOf(System.currentTimeMillis() + getRandomNumber());
    }

    private static String getRandomNumber() {

        int number = r.nextInt(1000);
        while (number < 100) {
            number = r.nextInt(1000);
        }
        return String.valueOf(number);
    }
}
