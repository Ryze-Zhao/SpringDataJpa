package com.zhaolearn.manytomany;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyApplicationTests {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void contextLoads() {
        List<Teacher> haha = new ArrayList<>();
        List<Student> hehe = new ArrayList<>();
        Set<Teacher> aascc = new HashSet<>();
        Set<Student> bbscc = new HashSet<>();
        Teacher aa = new Teacher("老师1", 30 );
        Student bb = new Student("学生1", 10 );
        Teacher cc = new Teacher("老师2" , 30 );
        Student dd = new Student("学生2" , 10 );
        aascc.add(aa);
        aascc.add(cc);
        bbscc.add(bb);
        bbscc.add(dd);
        aa.setStudents(bbscc);
        cc.setStudents(bbscc);
        bb.setTeachers(aascc);
        dd.setTeachers(aascc);
        haha.add(aa);
        haha.add(cc);
        hehe.add(bb);
        hehe.add(dd);
        teacherRepository.saveAll(haha);
       /* //随便保存一个就可以了，因为设置了级联，且双方都是维护方
        studentRepository.saveAll(bbscc);*/


    }

}
