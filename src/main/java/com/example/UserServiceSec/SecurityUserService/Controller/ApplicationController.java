package com.example.UserServiceSec.SecurityUserService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/student")
    public String student() {
        return "hello student";
    }

    @GetMapping("/admin")
    public String admin() {
        return "hello admin";
    }

    @GetMapping("/visitor")
    public String visitor() {
        return "hello visitor";
    }
}
