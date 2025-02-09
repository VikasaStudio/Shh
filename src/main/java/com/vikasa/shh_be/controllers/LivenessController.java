package com.vikasa.shh_be.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivenessController {

    @GetMapping("/live")
    public String live() {
        return "Live";
    }
}
