package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test!!";
    }

    @GetMapping("next")
    public String Hello(Model model){
        model.addAttribute("data","두리");

        return "duri";
    }
}
