package com.example.jira_ticket.dao;

import com.example.jira_ticket.domain.UserAccess;
import com.example.jira_ticket.dto.ConfigRequestDto;
import com.example.jira_ticket.repository.JiraTicketAccessRepository;
import com.example.jira_ticket.util.CustomSequenceGenerator;

public class AccessTableDao {
    JiraTicketAccessRepository jiraTicketAccessRepository;

    public String getFilter(String email) {
        return jiraTicketAccessRepository.findFilterByEmail(email);
    }

    public void saveFilter(ConfigRequestDto dto) {
        UserAccess userAccess = new UserAccess();
        userAccess.setSystemId(CustomSequenceGenerator.generateValue());
        userAccess.setEmail(dto.getEmail());
        userAccess.setFilter(dto.getFilter());
        jiraTicketAccessRepository.save(userAccess);

    }
}
