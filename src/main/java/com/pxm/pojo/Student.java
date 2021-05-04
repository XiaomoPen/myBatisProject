package com.pxm.pojo;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer studentId;
    private String name;
    private Integer age;
    private String sex;
    private Integer classId;

    public Student() {
    }

    public Student(Integer studentId, String name, Integer age, String sex, Integer classId) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", classId=" + classId +
                '}';
    }
}
