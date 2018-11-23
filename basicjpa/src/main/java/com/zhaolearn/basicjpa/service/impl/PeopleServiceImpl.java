package com.zhaolearn.basicjpa.service.impl;

import com.zhaolearn.basicjpa.domain.People;
import com.zhaolearn.basicjpa.repository.PeopleRepository;
import com.zhaolearn.basicjpa.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;
    @Override
    public People savePeople(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public List<People> findAllPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public People findPeople(long id) {
        return peopleRepository.findById(id).get();
    }

    @Override
    public List<People> findByAge(List<String> hehe) {
        return peopleRepository.findByAgeIn(hehe);
    }
}
