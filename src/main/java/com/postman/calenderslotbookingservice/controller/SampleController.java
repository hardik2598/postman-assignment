package com.postman.calenderslotbookingservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class SampleController {

    @GetMapping({"/", "hello"})
    public String helloWorld(Model model, Principal principal) {
        model.addAttribute("name", principal.getName());
        return "hello-world";
    }
}

