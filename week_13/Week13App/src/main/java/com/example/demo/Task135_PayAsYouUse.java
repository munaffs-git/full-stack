package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task13_5")
public class Task135_PayAsYouUse {

    @GetMapping("/pay")
    public String pay() {
        return "Normal Users: Low Cost → Peak Users: Auto Scaling → Pay only for usage";
    }
}