package com.llf.android_design_pattern.builder;

class Test {
    public static void main(String[] args) {

        //非Builder 模式
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        //Builder 模式
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainBoard("mainBoard")
                .create();
    }
}

