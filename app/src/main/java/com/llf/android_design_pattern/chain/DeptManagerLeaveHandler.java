package com.llf.android_design_pattern.chain;

// 部门经理处理类
public class DeptManagerLeaveHandler extends AbstractLeaveHandler {

    @Override
    public void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() > this.MIN && request.getLeaveDays() <= this.MIDDLE) {
            System.out.println("部门经理:已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}

