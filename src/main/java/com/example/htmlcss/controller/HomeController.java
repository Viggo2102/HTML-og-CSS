package com.example.htmlcss.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/universet")
    public String universet() {
        return "universet";
    }
    @GetMapping("/threeboxes")
    public String threeboxes() {
        return "threeboxes";
    }

    @GetMapping("/artikel")
    public String artikel() {
        return "artikel";
    }
}
