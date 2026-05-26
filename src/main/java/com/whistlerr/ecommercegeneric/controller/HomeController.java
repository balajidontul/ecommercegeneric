package com.whistlerr.ecommercegeneric.controller;

import com.whistlerr.ecommercegeneric.dto.UserDto;
import com.whistlerr.ecommercegeneric.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    String getHome(){
        return "Valid Access";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("userModel", new UserModel());
        return "register";
    }
}
