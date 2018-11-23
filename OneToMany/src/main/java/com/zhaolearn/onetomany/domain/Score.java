package com.zhaolearn.onetomany.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_score")
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

    public Score() {
    }

    @Override
    public String toString() {
        return "Score{" +
                "scoreId=" + scoreId +
                ", sName='" + sName + '\'' +
                ", sScore=" + sScore +
                '}';
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

    public Score(String sName, int sScore) {

        this.sName = sName;
        this.sScore = sScore;
    }
}
