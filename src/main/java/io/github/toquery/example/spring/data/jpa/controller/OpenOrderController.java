package io.github.toquery.example.spring.data.jpa.controller;

import io.github.toquery.example.spring.data.jpa.modules.order.entity.Order;
import io.github.toquery.example.spring.data.jpa.modules.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/open/order")
public class OpenOrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> page(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        return orderService.page(page, size);
    }

    @GetMapping("/list")
    public List<Order> list(@RequestParam(required = false) Long userId, @RequestParam(required = false) List<Long> orderIds) {
        return orderService.list(userId, orderIds);
    }

    @PostMapping
    public List<Order> save(Order order) {
        return orderService.save(order);
    }

    @PutMapping
    public Order update(Order order) {
        return orderService.update(order);
    }


    @DeleteMapping
    public void delete(@RequestParam(required = false) Long id) {
        orderService.delete(id);
    }

}
