package com.whistlerr.ecommercegeneric.controller;

import com.whistlerr.ecommercegeneric.dto.UserDto;
import com.whistlerr.ecommercegeneric.model.UserModel;
import com.whistlerr.ecommercegeneric.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.lang.IO.println;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/register")
    public String registerNewUser(@ModelAttribute UserModel userModel) {

        Boolean flag = userService.registerNewUser(userModel);

        return flag ? "redirect:/registered" : "notregister";
    }

    @GetMapping("/registered")
    public String registeredPage() {
        return "registered";
    }

}
