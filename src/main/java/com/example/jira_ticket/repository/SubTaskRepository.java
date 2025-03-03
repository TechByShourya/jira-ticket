package com.example.jira_ticket.repository;

import com.example.jira_ticket.domain.SubTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubTaskRepository extends JpaRepository<SubTask,Long> {

}
