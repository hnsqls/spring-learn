package com.ls.pojo;

public class Student {
    private Teacher teacher ;
    private  String name;

    public Student(Teacher teacher, String name) {
        this.teacher = teacher;
        this.name = name;
    }

    public void  study(){
        teacher.tech();
    }


    @Override
    public String toString() {
        return "Student{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                '}';
    }
}
