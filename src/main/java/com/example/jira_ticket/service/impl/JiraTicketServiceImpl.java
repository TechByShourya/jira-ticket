package com.example.jira_ticket.service.impl;

import com.example.jira_ticket.dao.AccessTableDao;
import com.example.jira_ticket.dao.TaskTableDao;
import com.example.jira_ticket.dto.ConfigRequestDto;
import com.example.jira_ticket.dto.ConfiguratorResponse;
import com.example.jira_ticket.service.JiraTicketService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.jira_ticket.util.Helper.errorResponse;
import static com.example.jira_ticket.util.Helper.successResponse;


@RequiredArgsConstructor
public class JiraTicketServiceImpl implements JiraTicketService {


    AccessTableDao accessTableDao;
    TaskTableDao taskTableDao;


    @Override
    public ConfiguratorResponse ShowAllTicketsWithFilter(Boolean access, String email) {
        if(Boolean.FALSE.equals(access)){
            return errorResponse("user don't have access for jira");
        }
        String filter = accessTableDao.getFilter(email);
        List<Object> data = taskTableDao.findAllData(filter);
        return successResponse("Data fetched" ,data);
    }

    @Override
    public ConfiguratorResponse GiveAccess(ConfigRequestDto dto) {
        accessTableDao.saveFilter(dto);
        return successResponse("access given","");
    }
}
