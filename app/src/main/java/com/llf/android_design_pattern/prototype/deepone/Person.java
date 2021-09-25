package com.llf.android_design_pattern.prototype.deepone;

public class Person implements Cloneable {
    private String name;
    private int age;
    private IdCard idCard;

    public Person(String name, int age, IdCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
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
                "personHashCode=" + this.hashCode() +
                ", name='" + name +
        ", age=" + age +
                ", idCard=" + idCard +
                ", idCardHashCode=" + idCard.hashCode() +
                '}';
    }

    //深克隆需要自己手动实现，在对象引用中也要实现clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //完成基本数据类型的拷贝
        //通过new关键字创建的对象是引用类型

        Object person = super.clone();

        //对引用类型单独处理
        Person p = (Person) person;
        IdCard idCard = (IdCard) p.getIdCard().clone(); //实现自己的克隆
        p.setIdCard(idCard);
        return p;
    }
}



