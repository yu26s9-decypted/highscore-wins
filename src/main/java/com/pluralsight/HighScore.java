package com.pluralsight;

import java.util.Scanner;

public class HighScore {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){


        System.out.println(determineWinner("Slytherin:Gryffindor|55:29"));

    }

    public static String askString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static String determineWinner(String parse) {
        String[] teamNames = parse.split("\\|");
        String[] teams = teamNames[0].split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        String[] scores = teamNames[1].split((":"));
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);
        int winingTeamScore = (homeScore > visitorScore ? homeScore : visitorScore );
        String winner = (homeScore > visitorScore ? homeTeam + " Wins!" : visitorTeam + " Wins!" + "With a score of " + winingTeamScore);



        return winner;


    }


}
