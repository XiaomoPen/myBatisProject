package com.pxm.vo;

public class StudentClasses {

    private Integer studentId;
    private String name;
    private Integer age;
    private String sex;
    private String className;

    public StudentClasses() {
    }

    public StudentClasses(Integer studentId, String name, Integer age, String sex, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StudentClasses{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
