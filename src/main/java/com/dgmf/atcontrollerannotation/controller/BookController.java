package com.dgmf.atcontrollerannotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/hello")
    @ResponseBody // To return Json Response to the Client
    public String hello() {
        return "Hello world !";
    }
}
