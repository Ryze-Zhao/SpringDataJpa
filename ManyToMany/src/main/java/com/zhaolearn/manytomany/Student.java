package com.zhaolearn.manytomany;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name = "teacher_student",
            joinColumns = {@JoinColumn(name = "g_student_id")},
            inverseJoinColumns = {@JoinColumn(name = "g_teacher_id")})
    @JsonIgnore
    private Set<Teacher> teachers;

  public Student(String sName, int sAge) {
    this.sName = sName;
    this.sAge = sAge;
  }

  public Student() {
  }

  public Student(String sName, int sAge, Set<Teacher> teachers) {

    this.sName = sName;
    this.sAge = sAge;
    this.teachers = teachers;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentId=" + studentId +
            ", sName='" + sName + '\'' +
            ", sAge=" + sAge +
            ", teachers=" + teachers +
            '}';
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

  public Set<Teacher> getTeachers() {
    return teachers;
  }

  public void setTeachers(Set<Teacher> teachers) {
    this.teachers = teachers;
  }
}
