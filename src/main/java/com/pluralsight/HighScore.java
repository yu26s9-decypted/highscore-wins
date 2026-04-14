package com.pluralsight;

import java.util.Scanner;

public class HighScore {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        String getUserInput = askString("Whats the score? (format: team1:team2|score1:score2)");
        System.out.println(determineWinner(getUserInput));

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
        int losingTeamScore = (homeScore < visitorScore ? homeScore : visitorScore );
        int pointDifference = winingTeamScore - losingTeamScore;
        String winner = (homeScore > visitorScore ? homeTeam + " Wins with score of " + winingTeamScore + "\n Point difference: " + pointDifference : visitorTeam + " Wins with a score of " + winingTeamScore + "\n with a point difference of: " + pointDifference);



        return winner;


    }


}
