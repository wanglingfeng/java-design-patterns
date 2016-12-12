package com.joseph.builder;

import com.joseph.builder.builder.SoccerTeamBuilder;
import com.joseph.builder.model.SoccerTeam;

/**
 * 导演类，提供construct方法调用建造者的建造方法，创建对象
 *
 * Created by lfwang on 2016/12/9.
 */
public class SoccerTeamDirector {

    private SoccerTeamBuilder builder;

    public SoccerTeamDirector() {

    }

    public SoccerTeamDirector(SoccerTeamBuilder builder) {
        this.builder = builder;
    }

    public SoccerTeam construct() {
        builder.buildLW();
        builder.buildST();
        builder.buildRW();

        return builder.buildSoccerTeam();
    }
}
