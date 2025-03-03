package com.example.jira_ticket.repository;

import com.example.jira_ticket.domain.UserAccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraTicketAccessRepository extends JpaRepository<UserAccess, Long> {

    String findFilterByEmail(String email);
}
