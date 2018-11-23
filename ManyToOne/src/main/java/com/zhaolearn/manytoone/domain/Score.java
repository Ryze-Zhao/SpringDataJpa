package com.zhaolearn.manytoone.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_score")
public class Score implements Serializable {
    //设置生成主键的策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "score_id")
    private Long scoreId;
    @Column(name = "s_name")
    private String sName;
    @Column(name = "s_score")
    private int sScore;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    //name是加在socre表的字段名，referencedColumnName是Student表的字段名
     //@JoinColumn(name = "s_student_id", referencedColumnName = "student_id")
    //这个是自定义中间关联表
    @JoinTable(name = "t_student_score",
            joinColumns = {@JoinColumn(name = "t_score_id", referencedColumnName = "score_id")},
            inverseJoinColumns = {@JoinColumn(name = "t_student_id", referencedColumnName = "student_id")}
    )
    private Student student;

    public Score() {
    }

    public Score(String sName, int sScore, Student student) {
        this.sName = sName;
        this.sScore = sScore;
        this.student = student;
    }

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsScore() {
        return sScore;
    }

    public void setsScore(int sScore) {
        this.sScore = sScore;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scoreId=" + scoreId +
                ", sName='" + sName + '\'' +
                ", sScore=" + sScore +
                ", student=" + student +
                '}';
    }
}
