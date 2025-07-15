package com.luo.extends5constructor;

public class Student {
    private String name;
    private int age;
    private int id;
private String schoolName;

    public Student(String name, int age, int id) {
        //this调兄弟构造器
        //注意事项；this()super()必须放在构造器的第一行，而且不能同时出现
        this(name, age, id, "清华大学");
    }
    public Student(String name, int age, int id,String schoolName) {
        this.name = name;
        this.age = age;
        this.id = id;

        this.schoolName = schoolName;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
