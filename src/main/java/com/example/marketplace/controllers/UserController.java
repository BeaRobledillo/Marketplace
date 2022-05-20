package com.example.marketplace.controllers;

import com.example.marketplace.service.IVespaService;
import com.example.marketplace.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/user")
public class UserController {
    @Autowired
    private IVespaService vespaService;

    @Autowired
    private IUserService userService;
}


