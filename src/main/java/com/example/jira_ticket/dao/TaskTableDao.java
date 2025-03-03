package com.example.jira_ticket.dao;

import com.example.jira_ticket.domain.SubTask;
import com.example.jira_ticket.repository.SubTaskRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskTableDao {
    SubTaskRepository subTaskRepository;

    @PersistenceContext
    private EntityManager entityManager;


    public List<Object> findAllData(String filter) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<SubTask> criteriaQuery = criteriaBuilder.createQuery(SubTask.class);
        Root<SubTask> root = criteriaQuery.from(SubTask.class);
        List<Predicate> predicates = getPredicates(criteriaBuilder,filter,root);
        criteriaQuery.where(predicates.toArray(new Predicate[0]));
        return Collections.singletonList(entityManager.createQuery(criteriaQuery).getResultList());
    }

    private List<Predicate> getPredicates(CriteriaBuilder  criteriaBuilder, String filter, Root<SubTask> root) {
        String[] parts = filter.split(" AND ");
        List<Predicate> predicates = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            String operator = part.contains(" IN ") ? " IN " : "=";
            String[] keyValue = part.split(operator, 2);

            if (keyValue.length < 2) continue;

            String key = keyValue[0].trim();
            String value = keyValue[1].replaceAll("[()\"']", "").trim();

            if (operator.equals(" IN ")) {
                List<String> values = Arrays.asList(value.split(",\\s*"));
                predicates.add(root.get(key).in(values));
            } else {
                predicates.add(criteriaBuilder.equal(root.get(key), value));
            }
        }

        return predicates;

    }
}
