package io.github.toquery.example.spring.data.jpa.modules.product.service;

import io.github.toquery.example.spring.data.jpa.modules.product.repository.ProductRepository;
import io.github.toquery.example.spring.data.jpa.modules.user.entity.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@RequiredArgsConstructor
@Service
public class ProductService {


    private final EntityManager entityManager;
    private final ProductRepository orderRepository;

    public List<User> page(Integer page, Integer size) {
        return null;
    }

    public List<User> list(Long userId, List<Long> orderIds) {
        return null;
    }

    public User update(User User) {
        return null;
    }

    public void delete(Long id) {
    }

    public List<User> save(User User) {
        return null;
    }
}
