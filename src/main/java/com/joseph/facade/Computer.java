package com.joseph.facade;

/**
 * Created by lfwang on 2016/12/9.
 */
public class Computer {

    private CPU cpu;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer.");
        cpu.startup();
        disk.startup();
        System.out.println("start the computer finished.");
    }

    public void shutdown() {
        System.out.println("start to close the computer.");
        cpu.shutdown();
        disk.shutdown();
        System.out.println("computer closed.");
    }
}
