package com.llf.android_design_pattern.prototype.deeptwo;

import java.io.Serializable;

//实现Serializable接口
public class IdCard implements Serializable {
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



