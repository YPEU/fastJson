package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.pojo.Student;

import java.util.Map;
import java.util.Set;

public class MapToObject {
    public static void main(String[] args) {
        String jsonString = "{\"lisi\":{\"birthday\":1678866328963,\"id\":2,\"name\":\"lisi\"}," +
                "\"zhangsan\":{\"birthday\":1678866328963,\"id\":1,\"name\":\"zhangsan\"}}";
        Map<String, Student> map = JSON.parseObject(jsonString, new TypeReference<Map<String, Student>>() {
        });
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            System.out.println(key + "::" + map.get(key));
        }

    }
}
