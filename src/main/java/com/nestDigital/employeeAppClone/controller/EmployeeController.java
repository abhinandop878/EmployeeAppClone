package com.nestDigital.employeeAppClone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Home(){
        return "this is my home";
    }
    @GetMapping("/add")
    public String EmployeeAdd(){
        return "this is my Employee Add page";
    }
    @GetMapping("/search")
    public String EmployeeSearch(){
        return "this is my Employee Search page";
    }
    @GetMapping("/delete")
    public String EmployeeDelete(){
        return "this is my Employee Delete page";
    }
}
