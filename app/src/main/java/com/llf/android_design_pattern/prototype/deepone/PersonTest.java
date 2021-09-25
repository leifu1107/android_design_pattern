package com.llf.android_design_pattern.prototype.deepone;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person("张三", 20, new IdCard("10086"));

        Person person1 = (Person) person.clone();
        Person person2 = (Person) person.clone();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }
}
