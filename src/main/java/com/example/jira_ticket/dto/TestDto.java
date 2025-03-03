package com.example.jira_ticket.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class TestDto implements Serializable {
    private String accountNumber;
    private String accountId;

}
