package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.pojo.Student;

import java.util.Date;

public class TOJsonString {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "123";
        student.birthday = getData();
        student.email = null;

        //  JSON.toJSONString()参数为对象，对象中的空值默认不参与序列化
        String jsonString = JSON.toJSONString(student, SerializerFeature.WriteMapNullValue);
        System.out.println(jsonString);
    }

    public static Date getData(){
        return new Date();
    }
}
