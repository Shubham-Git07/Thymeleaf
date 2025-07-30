package com.demo.Controller;

import com.demo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User("Shubham", "shubh@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Shubham", "shubh@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

}
