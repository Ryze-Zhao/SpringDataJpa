package com.zhaolearn.basicjpa.service;

import com.zhaolearn.basicjpa.domain.People;

import java.util.List;

public interface PeopleService {
    People savePeople(People people);

    List<People> findAllPeople();

    People findPeople(long id);

    List<People> findByAge(List<String> hehe);
}
