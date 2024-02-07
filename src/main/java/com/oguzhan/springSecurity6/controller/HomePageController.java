package com.oguzhan.springSecurity6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome User!";
    }

}
