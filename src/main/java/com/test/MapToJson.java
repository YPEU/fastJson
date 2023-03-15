package com.test;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

import java.util.Date;
import java.util.HashMap;

public class MapToJson {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<String,Student>();
        Student student = new Student();
        student.id = 1;
        student.name = "zhangsan";
        student.birthday = getData();

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "lisi";
        student2.birthday = getData();

        map.put(student.name,student);
        map.put(student2.name,student2);


        String jsonString = JSON.toJSONString(map);
        System.out.println("jsonString = " + jsonString);

    }


    public static Date getData(){
        return new Date();
    }

}
