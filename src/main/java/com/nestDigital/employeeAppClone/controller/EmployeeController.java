package com.nestDigital.employeeAppClone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping("/read")
    public String read(){
        return "this my read page";
    }
    @GetMapping("/viewall")
    public List viewAll(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':'Abhinand','age':20}");
        return myList;
    }
}
