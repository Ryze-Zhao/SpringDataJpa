package com.zhaolearn.testtransactional.controller;

import com.zhaolearn.testtransactional.domain.People;
import com.zhaolearn.testtransactional.service.PeopleService;
import com.zhaolearn.testtransactional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/test")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/rollback")
    public String testRollback() {

        return peopleService.testRollback();
    }

}

