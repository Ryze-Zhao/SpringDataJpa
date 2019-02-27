package com.zhaolearn.testtransactional.service.impl;

import com.zhaolearn.testtransactional.domain.People;
import com.zhaolearn.testtransactional.domain.Student;
import com.zhaolearn.testtransactional.repository.PeopleRepository;
import com.zhaolearn.testtransactional.service.PeopleService;
import com.zhaolearn.testtransactional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private StudentService studentService;

    @Override
    public String testRollback() {
        People sqlFind1=peopleRepository.findById((long)1).get();
        return null;
    }
}
