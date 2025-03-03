package com.example.jira_ticket.domain;

import com.example.jira_ticket.dto.TestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(TestDto.class)
public class Test {

    @Id
    private String accountNumber;

    @Id
    private String accountId;
}
