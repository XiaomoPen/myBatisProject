package com.pxm.test;

import com.pxm.dao.StudentDao;
import com.pxm.pojo.Demp;
import com.pxm.pojo.Student;
import com.pxm.vo.StudentClasses;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.util.List;

public class UserTest{

    public static void main(String[] args) {
        fun();
    }


    private static void fun(){
        try {
            Reader reader = Resources.getResourceAsReader("application.xml");
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);
            SqlSession sqlSession = factory.openSession();
//            List<Demp> objects = sqlSession.selectList("com.pxm.dao.DempDao.getUsers");
//            DempDao mapper = sqlSession.getMapper(DempDao.class);
//            List<Demp> objects=mapper.getUsers();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            Student student=new Student();
            student.setName("彭晓陌");
            List<StudentClasses> stu = mapper.getStudentBys(student);
            System.out.println(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fun1(){

        UserHandler handler=new UserHandler();
        Personal o = (Personal) Proxy.newProxyInstance(Personal.class.getClassLoader(), new Class[]{Personal.class}, handler);
        o.sleep();
    }
}
