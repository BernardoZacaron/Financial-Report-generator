package com.projects.java.financialreportgeneretor.classes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
    @RequestMapping("/")
    public String callHomePage() {
        return "index";
    }
}
