package com.demo.Controller;

import com.demo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // variable expressions
    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Shubham", "shubh@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // selection expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Shubham", "shubh@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // message expression
    // message expressions are used to access text from message.properties file
    @GetMapping("/message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    // link expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        // to pass parameter to the link url
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // fragment expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
}
