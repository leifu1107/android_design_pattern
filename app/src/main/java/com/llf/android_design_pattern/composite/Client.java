package com.llf.android_design_pattern.composite;

public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
    }

    //通过递归遍历树
    public static void showTree(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) { //叶子节点
                c.operation();
            } else { //树枝节点
                showTree((Composite) c);
            }
        }
    }
}

