package com.zhaolearn.entitymanager;

import com.zhaolearn.entitymanager.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EntityManagerApplicationTests {
    @Autowired
    private PeopleService peopleService;
    private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());
    @Test
    public void contextLoads() {
       log.info(peopleService.findPeople(1).toString());
    }

}
