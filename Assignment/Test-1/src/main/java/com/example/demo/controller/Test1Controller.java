package com.example.demo.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepo;
@RestController
public class Test1Controller {
	private TestRepo repository; // Fix the variable name

    @Autowired
    public void Controller(TestRepo repo) {
        this.repository = repository;
    }

    @GetMapping("/data")
    public List<TestEntity> getAllData() {
        return repository.findAll(); // Fix the method call
    }

}
