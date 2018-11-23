package com.zhaolearn.onetomany.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="t_student")
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
    //所有的级联、
    @OneToMany(cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    //  以下这句话可以不产生中间表，name是在score生成的列名为s_student_id，referencedColumnName对应student的列名为student_id。
    //   @JoinColumn(name = "s_student_id", referencedColumnName = "student_id")
    //这个是自定义中间关联表
    @JoinTable(name = "t_student_score",
            joinColumns = {@JoinColumn(name = "t_student_id", referencedColumnName = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "t_score_id", referencedColumnName = "score_id")}
    )
    private List<Score> scores;








    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", scores=" + scores +
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

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student() {

    }

    public Student(String sName, int sAge) {
        this.sName = sName;
        this.sAge = sAge;
    }

    public Student(String sName, int sAge, List<Score> scores) {

        this.sName = sName;
        this.sAge = sAge;
        this.scores = scores;
    }
}
