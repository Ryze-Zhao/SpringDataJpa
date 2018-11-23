package com.zhaolearn.onetomany;

import com.zhaolearn.onetomany.domain.Score;
import com.zhaolearn.onetomany.domain.Student;
import com.zhaolearn.onetomany.repository.StudentRepository;
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
public class OneToManyApplicationTests {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(OneToManyApplicationTests.class);
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void testStudent() {
        List<Score> aascc = new ArrayList<>();
        List<Score> bbscc = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Score ll = new Score("语文", 99);
        Score mm = new Score("数学", 89);
        Score nn = new Score("语文", 79);
        Score oo = new Score("数学", 69);
        Student aa = new Student("测试1", 11);
        Student bb = new Student("测试2", 12);
        aascc.add(ll);
        aascc.add(mm);
        bbscc.add(nn);
        bbscc.add(oo);
        aa.setScores(aascc);
        bb.setScores(bbscc);
        studentList.add(aa);
        studentList.add(bb);
        studentRepository.saveAll(studentList);
        List<Student> studentList2 =studentRepository.findAll();
        studentList2.stream().forEach(e->log.info(e.toString()));
    }

}
