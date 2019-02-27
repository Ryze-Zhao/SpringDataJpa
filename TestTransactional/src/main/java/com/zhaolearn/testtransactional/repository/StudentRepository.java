package com.zhaolearn.testtransactional.repository;


import com.zhaolearn.testtransactional.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> , JpaSpecificationExecutor<Student>  {


}