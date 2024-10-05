package com.ivoyant.docker_example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @GetMapping("/docker")
    public String dockerDemo() {
        return "Dockerizing springboot application";

    }
}
    