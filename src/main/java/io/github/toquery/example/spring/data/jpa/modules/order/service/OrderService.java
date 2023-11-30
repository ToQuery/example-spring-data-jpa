package io.github.toquery.example.spring.data.jpa.modules.order.service;

import io.github.toquery.example.spring.data.jpa.modules.order.entity.Order;
import io.github.toquery.example.spring.data.jpa.modules.order.repository.OrderRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@RequiredArgsConstructor
@Service
public class OrderService {


    private final EntityManager entityManager;
    private final OrderRepository orderRepository;

    public List<Order> page(Integer page, Integer size) {
        return null;
    }

    public List<Order> list(Long userId, List<Long> orderIds) {
        return null;
    }

    public Order update(Order order) {
        return null;
    }

    public void delete(Long id) {
    }

    public List<Order> save(Order order) {
        return null;
    }
}
