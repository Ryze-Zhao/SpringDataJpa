package com.zhaolearn.manytomany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="many_student")
public class Student implements Serializable {
  //设置生成主键的策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "s_name")
    private String sName;
    @Column(name = "s_age")
    private int sAge;
    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    //以下一个是单方管理，控制方是Student,双方可以复用
    @JoinTable(name = "student_teacher",
            joinColumns = {@JoinColumn(name = "g_student_id")},
            inverseJoinColumns = {@JoinColumn(name = "g_teacher_id")})
    @JsonIgnore
    private List<Teacher> teachers;
  public String toString1() {
    return "Student{" +
            "studentId=" + studentId +
            ", sName='" + sName + '\'' +
            ", sAge=" + sAge +
            ", teachers=" + teachers +
            '}';
  }
  @Override
  public String toString() {
    return "Student{" +
            "studentId=" + studentId +
            ", sName='" + sName + '\'' +
            ", sAge=" + sAge +'}';
  }













  public Student(String sName, int sAge) {
    this.sName = sName;
    this.sAge = sAge;
  }

  public Student() {
  }

  public Student(String sName, int sAge, List<Teacher> teachers) {
    this.sName = sName;
    this.sAge = sAge;
    this.teachers = teachers;
  }




  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public int getsAge() {
    return sAge;
  }

  public void setsAge(int sAge) {
    this.sAge = sAge;
  }

  public void setTeachers(List<Teacher> teachers) {
    this.teachers = teachers;
  }

  public List<Teacher> getTeachers() {
    return teachers;
  }
}
