package com.llf.android_design_pattern.prototype.clone;

public class Person implements Cloneable {

    private String name;
    private int age;
    private IdCard idCard;

    public Person() {
    }

    public Person(String name, int age, IdCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
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

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", age=" + age +
                ", idCard=" + idCard +
                ", idCard.hashCode=" + idCard.hashCode() + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


