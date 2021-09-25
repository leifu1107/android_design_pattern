package com.llf.android_design_pattern.prototype.deepone;

//实现Cloneable接口
public class IdCard implements Cloneable {
    private String id;

    public IdCard(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id='" + id +
        '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



