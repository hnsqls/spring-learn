package com.ls.pojo;


import java.util.List;

public class StudentList {
    private List<String> name;

    public StudentList(List<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "name=" + name +
                '}';
    }
}
