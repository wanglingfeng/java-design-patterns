package com.joseph.builder.model;

/**
 * Created by lfwang on 2016/12/9.
 */
public class SoccerTeam {

    private String lw;
    private String st;
    private String rw;

    public String getLw() {
        return "左边锋 -> " + lw;
    }

    public void setLw(String lw) {
        this.lw = lw;
    }

    public String getSt() {
        return "中锋 -> " + st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getRw() {
        return "右边锋 -> " + rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }
}
