package com.zhaolearn.testtransactional.service;


import com.zhaolearn.testtransactional.domain.Student;

import java.time.temporal.TemporalAmount;

public interface StudentService {

    Student findById(long l);
}
