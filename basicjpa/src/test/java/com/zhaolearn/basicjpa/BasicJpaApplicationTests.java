package com.zhaolearn.basicjpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhaolearn.basicjpa.domain.People;
import com.zhaolearn.basicjpa.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicJpaApplicationTests {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(BasicJpaApplicationTests.class);
    @Autowired
    private PeopleService peopleService;

    @Test
    public void testPeople() {
        List<String> hehe = new ArrayList<>();
        hehe.add("30");
        hehe.add("320");
        List<People> haha = peopleService.findByAge(hehe);
        haha.stream().forEach(e -> System.out.println(e));
    }
    @Test
    public void Json() {
        People obj=new People();
        ObjectMapper om = new ObjectMapper();
        try {
            String json = om.writeValueAsString(obj);
          log.info(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
