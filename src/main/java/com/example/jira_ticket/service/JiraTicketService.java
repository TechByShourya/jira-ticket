package com.example.jira_ticket.service;


import com.example.jira_ticket.dto.ConfigRequestDto;
import com.example.jira_ticket.dto.ConfiguratorResponse;

public interface JiraTicketService {
    ConfiguratorResponse ShowAllTicketsWithFilter(Boolean access, String email);

    ConfiguratorResponse GiveAccess(ConfigRequestDto dto);
}
