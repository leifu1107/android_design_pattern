package com.llf.android_design_pattern.chain;

public class Test {
    public static void main(String[] args) {
        LeaveRequest request1 = new LeaveRequest(1, "小明");
        LeaveRequest request2 = new LeaveRequest(3, "小明");
        LeaveRequest request3 = new LeaveRequest(7, "小明");

        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler();
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler();
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler();

        //直接主管下一级为部门经理
        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        //部门经理下一级为总经理
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        //小明请假直接领导处理
        directLeaderLeaveHandler.handlerRequest(request1);
        directLeaderLeaveHandler.handlerRequest(request2);
        directLeaderLeaveHandler.handlerRequest(request3);
    }
}