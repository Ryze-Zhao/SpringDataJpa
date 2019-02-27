package com.zhaolearn.entitymanager.impl;


import com.zhaolearn.entitymanager.domain.People;
import com.zhaolearn.entitymanager.service.PeopleService;
import org.omg.CORBA.PERSIST_STORE;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @PersistenceContext //重点
    private EntityManager entityManager;
    private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    @Transactional
    public People findPeople(long id) {

     /*   People people1 =entityManager.find(People.class,id);
        people1.setName("123123123122");
        entityManager.persist(people1);*/
//          people.setId((long) 3);
        People people1 =entityManager.find(People.class,(long)8);
        People people2 =entityManager.find(People.class,(long)8);

        return people1;
    }
}
