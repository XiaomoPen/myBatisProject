package com.pxm.test;

import com.pxm.dao.StudentDao;
import com.pxm.utils.SqlConnection;

public class Demo {

    public static void main(String[] args) {
        SqlConnection sqlConnection=new SqlConnection();

        StudentDao dao = (StudentDao) sqlConnection.getInterProxy(StudentDao.class);
        dao.getStudent();
    }
}
