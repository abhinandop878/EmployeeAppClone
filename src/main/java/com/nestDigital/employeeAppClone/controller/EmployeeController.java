package com.nestDigital.employeeAppClone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/home")
    public String Home(){
        return "this is my home";
    }
    @GetMapping("/employeeAdd")
    public String EmployeeAdd(){
        return "this is my Employee Add page";
    }
    @GetMapping("/employeeSearch")
    public String EmployeeSearch(){
        return "this is my Employee Search page";
    }
    @GetMapping("/employeeDelete")
    public String EmployeeDelete(){
        return "this is my Employee Delete page";
    }
}
