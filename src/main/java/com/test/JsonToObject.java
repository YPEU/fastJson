package com.test;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

public class JsonToObject {
    public static void main(String[] args) {
        String jsonString = "{\"birthday\":1678865293598,\"id\":2,\"name\":\"123321\"}";
        Student student = JSON.parseObject(jsonString,Student.class);
        System.out.println(student.toString());
        Object parse = JSON.parse(jsonString);
        System.out.println(parse);
    }
    //  jsonString = {"lisi":{"birthday":1678864577669,"id":2,"name":"lisi"},"zhangsan":{"birthday":1678864577669,"id":1,"name":"zhangsan"}}
}
