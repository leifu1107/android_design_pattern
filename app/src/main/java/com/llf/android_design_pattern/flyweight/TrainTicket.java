package com.llf.android_design_pattern.flyweight;

import java.util.Random;

public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
        this.price = new Random().nextInt(600);
    }

    @Override
    public void showInfo(String bunk) {
        System.out.println(String.format("%s->%s：%s价格：%s元", this.from, this.to, bunk, this.price));
    }
}

