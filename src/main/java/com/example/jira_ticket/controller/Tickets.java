package com.example.jira_ticket.controller;

import com.example.jira_ticket.dto.ConfiguratorResponse;
import com.example.jira_ticket.service.JiraTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@RequestMapping("/filter")
public class Tickets {

    private JiraTicketService jiraTicketService;

    @GetMapping("/ticket")
    public ConfiguratorResponse ShowAllTickets(@RequestParam(name = "access") Boolean access ,
                                            @RequestParam(name = "email") String email){
        return jiraTicketService.ShowAllTicketsWithFilter(access , email);
    }

    @PostMapping("new-ticket")
    public ConfiguratorResponse CreateTicket(){
        return null;
    }



}
