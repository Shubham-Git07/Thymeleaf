package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloworld(Model model){
        model.addAttribute("message", "Hello  World from shubham");
        return "Hello";
    }

}
