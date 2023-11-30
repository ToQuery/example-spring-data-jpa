package io.github.toquery.example.spring.data.jpa.modules.product.repository;

import io.github.toquery.example.spring.data.jpa.modules.product.entity.Product;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 *
 */
public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> { // , QuerydslPredicateExecutor<Order> {

}
