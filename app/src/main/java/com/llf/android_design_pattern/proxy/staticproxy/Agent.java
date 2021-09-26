package com.llf.android_design_pattern.proxy.staticproxy;

public class Agent implements Play {
    //被代理对象
    private Play player;
    private long money;

    /**
     * @param player
     * @param money  收费
     */
    public Agent(Play player, long money) {
        this.player = player;
        this.money = money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public void sing(int count) {
        player.sing(count);
    }

    //控制了被代理对象的访问
    @Override
    public void show() {
        if (money > 100) {
            player.show();
        } else {
            System.out.println("baibai...");
        }
    }
}
