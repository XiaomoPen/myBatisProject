package com.pxm.test;

import org.apache.ibatis.annotations.Select;

public interface Personal {

    @Select("1111")
    public void eat();

    @Select("select * from user")
    public void sleep();
}
