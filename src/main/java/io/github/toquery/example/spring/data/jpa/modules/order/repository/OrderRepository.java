package io.github.toquery.example.spring.data.jpa.modules.order.repository;

import io.github.toquery.example.spring.data.jpa.modules.order.entity.Order;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 *
 */
public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>, QuerydslPredicateExecutor<Order> {

}
