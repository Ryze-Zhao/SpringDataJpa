package com.zhaolearn.manytoone;

import com.zhaolearn.manytoone.domain.Score;
import com.zhaolearn.manytoone.domain.Student;
import com.zhaolearn.manytoone.repository.ScoreRepository;
import com.zhaolearn.manytoone.repository.StudentRepository;
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
public class ManyToOneApplicationTests {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(ManyToOneApplicationTests.class);
/*  */
@Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    @Test
    public void testManyToOne() {
        Student aa = new Student("测试1", 11);
        Student bb = new Student("测试2", 12);

        Score ll = new Score("语文", 99,aa);
        Score mm = new Score("数学", 89,aa);
        Score nn = new Score("语文", 79,bb);
        Score oo = new Score("数学", 69,bb);
        List<Score> aascc = new ArrayList<>();
        aascc.add(ll);
        aascc.add(mm);
        aascc.add(nn);
        aascc.add(oo);
     scoreRepository.saveAll(aascc);
        List<Score> bbscc=scoreRepository.findAll();
        bbscc.stream().forEach(e->log.info(e.toString()));
    }

}
