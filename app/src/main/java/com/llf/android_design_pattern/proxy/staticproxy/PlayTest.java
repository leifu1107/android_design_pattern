package com.llf.android_design_pattern.proxy.staticproxy;

public class PlayTest {
    public static void main(String[] args){
        Actor actor = new Actor();
        Agent agent = new Agent(actor, 50);
        agent.sing(2);
        agent.show();
        agent.setMoney(200);
        agent.show();
    }
}
