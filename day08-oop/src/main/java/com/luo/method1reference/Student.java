package com.luo.method1reference;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;

    public static  int compareByAge(Student s1,Student s2){
        return s1.getAge()-s2.getAge();
    }
    public int compareByName(Student s1,Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}
