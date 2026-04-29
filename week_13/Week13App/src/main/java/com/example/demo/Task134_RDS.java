package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task13_4")
public class Task134_RDS {

    @GetMapping("/rds")
    public String rds() {
        return "RDS Created → Status Available → Backup Enabled";
    }
}