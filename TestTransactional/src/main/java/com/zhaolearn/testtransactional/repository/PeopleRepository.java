package com.zhaolearn.testtransactional.repository;


import com.zhaolearn.testtransactional.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PeopleRepository extends JpaRepository<People, Long> , JpaSpecificationExecutor<People>  {


    List<People> findByAgeIn(List<String> ages);
}