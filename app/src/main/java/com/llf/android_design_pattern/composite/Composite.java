package com.llf.android_design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    //构件容器
    private List<Component> componentArrayList = new ArrayList<Component>();

    //增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    //获得分支下的所有叶子构件和树枝构件
    public List<Component> getChildren() {
        return this.componentArrayList;
    }
}

