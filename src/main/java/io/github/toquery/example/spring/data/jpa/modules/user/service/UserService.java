package io.github.toquery.example.spring.data.jpa.modules.user.service;

import io.github.toquery.example.spring.data.jpa.modules.user.entity.User;
import io.github.toquery.example.spring.data.jpa.modules.user.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@RequiredArgsConstructor
@Service
public class UserService {


    private final EntityManager entityManager;
    private final UserRepository orderRepository;

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
