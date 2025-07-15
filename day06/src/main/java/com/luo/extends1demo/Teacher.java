package com.luo.extends1demo;

public class Teacher extends People{
//只能继承父类的非私有成员

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
