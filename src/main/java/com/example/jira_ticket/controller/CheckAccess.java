package com.example.jira_ticket.controller;

import com.example.jira_ticket.dto.ConfigRequestDto;
import com.example.jira_ticket.dto.ConfiguratorResponse;
import com.example.jira_ticket.service.JiraTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jira-ticket")
@RequiredArgsConstructor
public class CheckAccess {

    private JiraTicketService jiraTicketService;

    @PutMapping("/provide/access")
    public ConfiguratorResponse giveAccess(@RequestBody ConfigRequestDto dto){
        return jiraTicketService.GiveAccess(dto);
    }
}
