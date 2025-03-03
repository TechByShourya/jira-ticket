package com.example.jira_ticket.util;

import com.example.jira_ticket.dto.ConfiguratorResponse;

import static com.example.jira_ticket.common.constants.*;

public class Helper {
    public static ConfiguratorResponse errorResponse(String message) {
        return new ConfiguratorResponse(CODE_400, ERROR, message, null);
    }

    public static ConfiguratorResponse successResponse(String message, Object data) {
        return new ConfiguratorResponse(CODE_200, SUCCESS, message, data);
    }
}
