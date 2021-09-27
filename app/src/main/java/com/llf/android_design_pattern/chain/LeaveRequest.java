package com.llf.android_design_pattern.chain;

//员工提交请求类
public class LeaveRequest {
    /**
     * 天数
     */
    private int leaveDays;
    /**
     * 姓名
     */
    private String name;

    public LeaveRequest(int leaveDays, String name) {
        this.leaveDays = leaveDays;
        this.name = name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
