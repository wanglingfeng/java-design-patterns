package com.joseph.builder;

import com.joseph.builder.builder.impl.RealMadridBuilder;
import com.joseph.builder.model.SoccerTeam;

/**
 * Created by lfwang on 2016/12/9.
 */
public class BuilderTests {

    public static void main(String... args) {
        SoccerTeamDirector director = new SoccerTeamDirector(new RealMadridBuilder());
        SoccerTeam person = director.construct();

        System.out.println(person.getLw() + " | " + person.getSt() + " | " + person.getRw());
    }
}
