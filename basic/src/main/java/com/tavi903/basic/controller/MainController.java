package com.tavi903.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class MainController {

    @RolesAllowed("ADMIN")
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/ciao")
    public String ciao() { return "Ciao"; }

}
