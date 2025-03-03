package com.example.jira_ticket.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sub_task")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SubTask {
    @Id
    @Column(name ="system_id" , nullable = false)
    private Long systemId;
    @Column(name = "assigned")
    private String assignedEmail;
}
