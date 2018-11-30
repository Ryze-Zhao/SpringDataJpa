package com.zhaolearn.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @JsonIgnore
    //以下一个是单方管理，控制方是Student
//    @ManyToMany(fetch=FetchType.EAGER ,targetEntity = Student.class, mappedBy = "teachers")
    //以下一个是双方管理
    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
    @JoinTable(name = "teachaer_student",
            joinColumns = {@JoinColumn(name = "g_teacher_id",referencedColumnName="teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "g_student_id",referencedColumnName="student_id")})
    private List<Student> students;

    public String toString1() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", students=" + students +
                '}';
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +'}';
    }




    public Teacher(String tName, int tAge) {
        this.tName = tName;
        this.tAge = tAge;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher() {

    }

    public Teacher(String tName, int tAge, List<Student> students) {
        this.tName = tName;
        this.tAge = tAge;
        this.students = students;
    }


}
