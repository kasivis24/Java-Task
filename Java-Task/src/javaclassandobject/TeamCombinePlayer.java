package javaclassandobject;

import javaclassandobject.Player;
import javaclassandobject.Team;

import java.util.Arrays;

public class TeamCombinePlayer {
    public static void main(String[] args) {
        Player player = new Player("KaviArasan","Forward",17);
        Player player1 = new Player("KasiVis","Forward",2);
        Player player2 = new Player("Prabha","Defense",33);
        Player player3 = new Player("Alagu","Goal Keeper", 22);

        Team team = new Team("Cracks","Tenkasi","1st Division", Arrays.asList(player,player1,player2,player3));

            System.out.println("Combined : "+ team);

    }
}