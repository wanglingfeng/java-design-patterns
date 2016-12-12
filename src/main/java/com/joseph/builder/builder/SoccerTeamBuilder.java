package com.joseph.builder.builder;

import com.joseph.builder.model.SoccerTeam;

/**
 * SoccerTeam对象构造接口
 *
 * Created by lfwang on 2016/12/9.
 */
public interface SoccerTeamBuilder {

    void buildLW();

    void buildST();

    void buildRW();

    SoccerTeam buildSoccerTeam();
}
