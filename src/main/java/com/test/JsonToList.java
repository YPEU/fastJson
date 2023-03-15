package com.test;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

import java.util.List;

public class JsonToList {
    public static void main(String[] args) {
        String jsonString = "[{\"birthday\":1678865293598,\"id\":1,\"name\":\"123\"},{\"birthday\":1678865293598,\"id\":2,\"name\":\"123321\"}]";
        List<Student> students = JSON.parseArray(jsonString, Student.class);
        System.out.println(students);
    }
}
