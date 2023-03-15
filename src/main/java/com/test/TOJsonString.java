package com.test;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

import java.util.Date;

public class TOJsonString {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "123";
        student.birthday = getData();
        String jsonString = JSON.toJSONString(student);
        System.out.println(jsonString);
    }

    public static Date getData(){
        return new Date();
    }
}
