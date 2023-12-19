package com.dgmf.annotations.atcontroller.controller;

import com.dgmf.annotations.atcontroller.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// To make this Class a Spring MVC Controller to
// handle incoming HTTP Requests
@Controller // Specialization of "@Component" Annotation
public class BookController {
    // Handler Method
    @RequestMapping("/hello-book") // Map the incoming HTTP Request
    // to this Method
    @ResponseBody // To convert into Json format the returned
    // Response to the Client
    public String hello() {
        return "Hello Book !";
    }

    // Handler Method
    @RequestMapping("/book") // Map the incoming HTTP Request
    // to this Method
    @ResponseBody // To convert into Json format the returned
    // Response to the Client
    public Book getBook() {
        Book book = new Book(
                1L,
                "Core Spring Framework",
                "Spring Annotations"
        );

        return book;
    }
}
