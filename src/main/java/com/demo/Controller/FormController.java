package com.demo.Controller;

import com.demo.Model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // handler method to handle user registration page request
    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        // empty userForm model object to store form data
        UserForm userForm = new UserForm();

        model.addAttribute("userForm", userForm);

        List<String> listProfessions = Arrays.asList("Developers", "Testers", "Architect");
        model.addAttribute("listProfessions", listProfessions);
        return "register-form";
    }

    @PostMapping("/register/save")
    public String submitForm(@ModelAttribute("userForm") UserForm userForm) {
        // Here you can print, save to DB, etc.
        System.out.println("User Submitted: " + userForm);
//        @ModelAttribute = no need to create separate model to add the object
        // it will automatically make available UserForm object
//        model.addAttribute("userForm", userForm);
        return "registration-success";
    }
}
