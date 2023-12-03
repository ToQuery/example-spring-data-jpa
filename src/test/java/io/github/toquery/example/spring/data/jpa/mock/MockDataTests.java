package io.github.toquery.example.spring.data.jpa.mock;

import io.github.toquery.example.spring.data.jpa.modules.order.entity.Order;
import io.github.toquery.example.spring.data.jpa.modules.order.entity.OrderProduct;
import io.github.toquery.example.spring.data.jpa.modules.order.repository.OrderRepository;
import io.github.toquery.example.spring.data.jpa.modules.product.entity.Product;
import io.github.toquery.example.spring.data.jpa.modules.product.repository.ProductRepository;
import io.github.toquery.example.spring.data.jpa.modules.user.entity.User;
import io.github.toquery.example.spring.data.jpa.modules.user.repository.UserRepository;
import io.github.toquery.example.spring.data.jpa.modules.user.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MockDataTests {

    @Resource
    private UserRepository userRepository;

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private ProductRepository productRepository;

    @Test
    void mockAllData() {

        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setDeleted(false);
            product.setProductName("product" + i);
            product.setPrice(100.0 + i);
            product.setSalesVolume(100 + i);
            productList.add(product);
        }

        productList = productRepository.saveAllAndFlush(productList);


        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setDeleted(false);
            user.setNickName("nickname" + i);
            user.setProducts(productList.subList(0,3));

            userList.add(user);
        }


        userList = userRepository.saveAll(userList);


        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);

            for (int j = 0; j < 3; j++) {
                Order order = new Order();
                order.setAddressId(1L);
                order.setOrderStatus(1);
                order.setCreateDateTime(LocalDateTime.now());
                order.setPrice(100.0 + j);
                order.setUser(user);
                List<OrderProduct> orderProducts = new ArrayList<>();
                for (int k = 0; k < 2; k++) {
                    Product product = productList.get(k);
                    OrderProduct orderProduct = new OrderProduct();
                    orderProduct.setOrder(order);
                    orderProduct.setProduct(product);
                    orderProduct.setNum(k);
                    orderProduct.setPrice(product.getPrice() * k);
                    orderProducts.add(orderProduct);
                }
                order.setOrderProducts(orderProducts);
                orders.add(order);
            }
            user.setOrders(orders);
        }
        userList = userRepository.saveAll(userList);
        orders = orderRepository.saveAll(orders);


    }
}
