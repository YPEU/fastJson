package com.pojo;

import java.util.Date;

public class Student {
    public Integer id;
    public String name;
    public Date birthday;
    public String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ",email=" + email +
                '}';
    }
}
