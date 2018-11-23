package com.zhaolearn.onetomany.repository;

import com.zhaolearn.onetomany.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> , JpaSpecificationExecutor<Student>  {
}
