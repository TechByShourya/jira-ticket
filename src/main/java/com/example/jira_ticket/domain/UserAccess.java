package com.example.jira_ticket.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_access")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserAccess {
    @Id
    @Column(name ="system_id" , nullable = false)
    private Long systemId;
    @Column(name = "username")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "filter")
    private String filter;
}
