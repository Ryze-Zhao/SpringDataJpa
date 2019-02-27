package com.zhaolearn.testtransactional.service.impl;


import com.zhaolearn.testtransactional.repository.StudentRepository;
import com.zhaolearn.testtransactional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

}
