package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        FotballPlayer Qamas = new FotballPlayer("Qamas");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Beckham = new SoccerPlayer("Beckham");

        Team<FotballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(Qamas);
        //adelaideCrows.addPlayer(Pat);
        //adelaideCrows.addPlayer(Beckham);

        System.out.println(adelaideCrows.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(Pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(Beckham);


        Team<FotballPlayer> melbourne = new Team<>("Melbourne");
        FotballPlayer banks = new FotballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FotballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FotballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        adelaideCrows.matchResult(baseballTeam,1,1);




    }

}