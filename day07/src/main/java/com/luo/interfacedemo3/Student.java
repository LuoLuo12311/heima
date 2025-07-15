package com.luo.interfacedemo3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor
//lombok自动生成getter和setter方法和有参无参构造器
public class Student {

    private String name;
    private char sex;
    private int score;
}
