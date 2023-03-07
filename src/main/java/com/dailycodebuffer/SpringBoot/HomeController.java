package com.dailycodebuffer.SpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String homeController(){
        return welcomeMessage;
    }
}
