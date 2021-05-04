package com.pxm.dao;

import com.pxm.annotation.Select;
import com.pxm.pojo.Student;
import com.pxm.vo.StudentClasses;

import java.util.List;

public interface StudentDao {

    @Select("select * from student")
    List<Student> getStudent();

    List<StudentClasses> getStudentBys(Student student);

}
