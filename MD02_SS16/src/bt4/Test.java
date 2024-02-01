package bt4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam(1,"ASR",11,56);
        FootballTeam footballTeam1 = new FootballTeam(2,"Real",12,34);
        FootballTeam footballTeam2 = new FootballTeam(5,"Mu",6,45);
        FootballTeam footballTeam3 = new FootballTeam(3,"PSG",17,48);
        FootballTeam footballTeam4 = new FootballTeam(4,"Inter",14,90);
        List<FootballTeam> footballTeamList = new ArrayList<>();
        footballTeamList.add(footballTeam);
        footballTeamList.add(footballTeam1);
        footballTeamList.add(footballTeam2);
        footballTeamList.add(footballTeam3);
        footballTeamList.add(footballTeam4);

       Sorting.insertSort(footballTeamList, Comparator.comparingDouble(FootballTeam::getScore));
        for (FootballTeam team : footballTeamList) {
            System.out.println(team.toString());
        }
    }
}
