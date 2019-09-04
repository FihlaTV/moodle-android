package com.example.ks.moodle.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String xuehao;
    private String password;
    private String name;
    private String description;

    public Student(String xuehao, String password, String name, String description) {
        this.xuehao = xuehao;
        this.password = password;
        this.name = name;
        this.description = description;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
