package com.zhaolearn.basicjpa.controller;

import com.zhaolearn.basicjpa.domain.People;
import com.zhaolearn.basicjpa.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/peoplec")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    //RESTful规范
    @PostMapping(value = "/people")
    public People savePeople(@RequestBody People people) {
        return peopleService.savePeople(people);
    }
    //RESTful规范
    @GetMapping(value = "/peoples")
    public List<People> findAllPeople() {
        return peopleService.findAllPeople();
    }

    @GetMapping(value = "/people/{id}")
    public People findPeople(@PathVariable("id")long id) {
        return peopleService.findPeople(id);
    }
}

