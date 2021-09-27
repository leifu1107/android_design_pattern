package com.llf.android_design_pattern.chain;

//总经理处理类
public class GManagerLeaveHandler extends AbstractLeaveHandler {

    @Override
    public void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() > this.MIDDLE && request.getLeaveDays() <= this.MAX) {
            System.out.println("总经理:已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}
