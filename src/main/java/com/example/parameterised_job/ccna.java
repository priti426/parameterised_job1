package com.example.parameterised_job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ccna {
    @GetMapping("/ccna")
    public String getData() {return  "Welcome to ccna Class" ; }
}