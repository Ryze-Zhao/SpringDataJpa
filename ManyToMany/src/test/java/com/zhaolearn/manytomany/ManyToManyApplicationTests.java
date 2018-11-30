package com.zhaolearn.manytomany;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Test
    public void contextLoads() {
        List<Teacher> haha = new ArrayList<>();
        List<Student> hehe = new ArrayList<>();
        Teacher aa = new Teacher("老师1", 30 );
        Student bb = new Student("学生1", 10 );
        Teacher cc = new Teacher("老师2" , 30 );
        Student dd = new Student("学生2" , 10 );
        haha.add(aa);
        haha.add(cc);
        hehe.add(bb);
        hehe.add(dd);
        aa.setStudents(hehe);
        cc.setStudents(hehe);
        bb.setTeachers(haha);
        dd.setTeachers(haha);

        //Teacher的维护交给了Student，所以保存Student会导致teacher也被保存，如果保存Teacher只会保存teacher的。
       /* teacherRepository.saveAll(haha);*/
       //随便保存一个就可以了，因为设置了级联，且双方都是维护方
        studentRepository.saveAll(hehe);
     /*   studentRepository.findAll().stream().forEach(e->log.info(e.toString()));*/
    }

}
