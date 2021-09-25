package com.llf.android_design_pattern.prototype.deeptwo;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        //创建一个对象
        Person person = new Person("张三", 20, new IdCard("10086"));

        //克隆两个对象
        Person person1 = (Person) person.deelClone();
        Person person2 = (Person) person.deelClone();
        System.out.println("深拷贝(第二种 实现序列化接口)");
        //打印三人信息
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }
}

