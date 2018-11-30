package com.zhaolearn.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "many_teacher")
public class Teacher implements Serializable {
    //设置生成主键的策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "teacher_id")
    private Long teacherId;
    @Column(name = "t_name")
    private String tName;
    @Column(name = "t_age")
    private int tAge;

    @ManyToMany(targetEntity = Student.class, mappedBy = "teachers")
    private Set<Student> students;

    public Teacher(String tName, int tAge) {
        this.tName = tName;
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", students=" + students +
                '}';
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Teacher() {

    }

    public Teacher(String tName, int tAge, Set<Student> students) {

        this.tName = tName;
        this.tAge = tAge;
        this.students = students;
    }
}
