package io.github.toquery.example.spring.data.jpa.controller;

import io.github.toquery.example.spring.data.jpa.modules.user.entity.User;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OpenUserController {
    @QueryMapping
    public User userById(@Argument String id) {
//        return User.getById(id);
        return null;
    }

//    @SchemaMapping
//    public Author orders(Book book) {
//        return Author.getById(book.authorId());
//    }
}
