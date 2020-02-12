package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {


        League<Team<FotballPlayer>> footballLeague = new League<>("AFL");
        Team<FotballPlayer> adelaideCrows = new Team<>("Adelaide");
        Team<FotballPlayer> melbourne = new Team<>("Melbourne");
        Team<FotballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FotballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        //footballLeague.add(baseballTeam);

        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);


        footballLeague.add(rawTeam);

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);
        rawLeague.add(rawTeam);
        rawLeague.add(baseballTeam);

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);
        reallyRaw.add(rawTeam);
        reallyRaw.add(baseballTeam);







    }

}