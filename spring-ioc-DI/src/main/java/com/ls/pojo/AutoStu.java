package com.ls.pojo;
//自动装配
public class AutoStu {
    private Teacher teacher;

    public void setArtTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "AutoStu{" +
                "teacher=" + teacher +
                '}';
    }
}
