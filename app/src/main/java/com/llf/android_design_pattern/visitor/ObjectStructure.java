package com.llf.android_design_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

//结构对象(ObjectStructure)角色：有如下的责任，可以遍历结构中的所有元素。
class ObjectStructure {

    private List<Computer> computers = new ArrayList<Computer>();

    public void action(Visitor visitor) {
        for (Computer c : computers) {
            c.accept(visitor);
        }
    }

    public void add(Computer computer) {
        computers.add(computer);
    }
}

