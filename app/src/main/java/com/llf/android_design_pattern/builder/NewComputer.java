package com.llf.android_design_pattern.builder;

/**
 * 通过Builder来构建产品对象, 而NewComputer封装了构建复杂产品对象对象的过程，不对外隐藏构建细节。
 */
public class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public static final class Builder {
        private NewComputer mNewComputer;

        public Builder() {
            mNewComputer = new NewComputer();
        }

        public Builder cpu(String val) {
            mNewComputer.cpu = val;
            return this;
        }

        public Builder screen(String val) {
            mNewComputer.screen = val;
            return this;
        }

        public Builder memory(String val) {
            mNewComputer.memory = val;
            return this;
        }

        public Builder mainBoard(String val) {
            mNewComputer.mainBoard = val;
            return this;
        }

        public NewComputer create() {
            return mNewComputer;
        }

    }
}
