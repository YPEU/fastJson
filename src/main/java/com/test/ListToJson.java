package com.test;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

import java.util.ArrayList;
import java.util.Date;

public class ListToJson {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();
        student.id = 1;
        student.name = "123";
        student.birthday = getData();

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "123321";
        student2.birthday = getData();

        list.add(student);
        list.add(student2);

        String jsonString = JSON.toJSONString(list);
        System.out.println("jsonString = " + jsonString);

    }


    public static Date getData(){
        return new Date();
    }

}
