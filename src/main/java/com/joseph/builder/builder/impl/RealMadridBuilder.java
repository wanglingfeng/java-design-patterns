package com.joseph.builder.builder.impl;

import com.joseph.builder.builder.SoccerTeamBuilder;
import com.joseph.builder.model.SoccerTeam;

/**
 * Person对象的构造器
 *
 * Created by lfwang on 2016/12/9.
 */
public class RealMadridBuilder implements SoccerTeamBuilder {

    private SoccerTeam soccerTeam;

    public RealMadridBuilder() {
        soccerTeam = new SoccerTeam();
    }

    @Override
    public void buildLW() {
        soccerTeam.setLw("克里斯蒂亚诺·罗纳尔多");
    }

    @Override
    public void buildST() {
        soccerTeam.setSt("卡里姆·本泽马");
    }

    @Override
    public void buildRW() {
        soccerTeam.setRw("加雷斯·贝尔");
    }

    @Override
    public SoccerTeam buildSoccerTeam() {
        return soccerTeam;
    }
}
