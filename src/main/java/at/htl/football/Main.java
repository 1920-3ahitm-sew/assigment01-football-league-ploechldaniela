package at.htl.football;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        League league = new League();
        List<String> list = readTable();

        for (int i = 1; i < list.size(); i++) {

            String[] line = list.get(i).split(";");
            league.addMatchResult(new Match(line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4])));

        }

        printTable(league.getTable());

    }

    private static void printTable(List<Team> teamList){

        System.out.println("Team                 Pts   W   D   L  GF  GA  GD");

        for (Team t : teamList){
            System.out.printf("%-20s %3d %3d %3d %3d %3d %3d %3d\n", t.getName(), t.getPoints(), t.getWins(), t.getDraws(), t.getDefeats(), t.getGoalsShot(), t.getGoalsReceived(), t.getGoalsShot() - t.getGoalsReceived());
        }

        System.out.println("\nPts...Points, W...Won, D...Drawn, L...Lost\nGF...Goals for, GA...Goals against, GD...Goal difference");

    }

    public static List readTable() {

        Path file = Paths.get("bundesliga-1819.csv");
        List<String> list = null;
        try {
            list = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

}
