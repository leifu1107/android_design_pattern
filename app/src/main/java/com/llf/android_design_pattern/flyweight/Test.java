package com.llf.android_design_pattern.flyweight;

public class Test {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("杭州", "北京");
        ticket.showInfo("动车");
        ticket = TicketFactory.queryTicket("杭州", "北京");
        ticket.showInfo("动车");
        ticket = TicketFactory.queryTicket("杭州", "北京");
        ticket.showInfo("动车");
    }
}
