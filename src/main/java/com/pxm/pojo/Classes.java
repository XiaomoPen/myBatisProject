package com.pxm.pojo;

import java.io.Serializable;

public class Classes implements Serializable {

    private Integer classId;
    private String className;

    public Classes() {
    }

    public Classes(Integer classId, String name) {
        this.classId = classId;
        this.className = name;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return className;
    }

    public void setName(String name) {
        this.className = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", name='" + className + '\'' +
                '}';
    }
}
