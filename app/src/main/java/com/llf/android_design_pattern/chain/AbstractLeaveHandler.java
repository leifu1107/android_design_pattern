package com.llf.android_design_pattern.chain;

//请假责任链抽象处理类
abstract public class AbstractLeaveHandler {
    /**
     * 直接主管审批处理的请假天数
     */
    public int MIN = 1;
    /**
     * 部门经理处理的请假天数
     */
    public int MIDDLE = 3;
    /**
     * 总经理处理的请假天数
     */
    public int MAX = 30;

    /**
     * 下一个处理节点（即更高级别的领导）
     */
    public AbstractLeaveHandler nextHandler;

    /**
     * 设置下一节点
     */
    public void setNextHandler(AbstractLeaveHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 处理请假的请求，子类实现
     */
    abstract public void handlerRequest(LeaveRequest request);
}
