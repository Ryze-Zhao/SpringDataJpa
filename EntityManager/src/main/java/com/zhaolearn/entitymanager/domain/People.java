package com.zhaolearn.entitymanager.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="people")
public class People implements Serializable {
    //设置生成主键的策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "p_id")
    private Long id;
    @Column(name = "p_name")
    private String name;
    @Column(name = "p_age")
    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}