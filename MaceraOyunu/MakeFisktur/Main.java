package MakeFisktur;

import java.util.LinkedList;
import  java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rasgele = new Random();

        List<String> teams = new LinkedList<>();
        List<String> Matches = new LinkedList<>();
        List<String> MatchMakerteams = new LinkedList<>();

        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        //teams.add("Konyaspor");

        List<String> yedekteam = new LinkedList<>();
        yedekteam.addAll(teams);

        System.out.println("---------Takımlar---------");

        for (String s : teams) {
            System.out.println(s);
        }

        System.out.println();

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int sayac = (teams.size() * 2) - 2;
        int k = 1;
        while (sayac > 0) {
            System.out.println("Round " + k);
            int teamofnumber = teams.size() / 2;
            while (teamofnumber > 0) {
                int i = rasgele.nextInt(teams.size());
                int rasgeleTeam = rasgele.nextInt(teams.size());


                boolean isTrue = true;
                for (int j = 0; j < Matches.size(); j++) {
                    if ((teams.get(i) + "vs" + teams.get(rasgeleTeam)).equals(Matches.get(j))) {
                        isTrue = false;
                        break;
                    }
                }

                if (isTrue && !(teams.get(i).equals(teams.get(rasgeleTeam))) && !(MatchMakerteams.contains(teams.get(i))) && !(MatchMakerteams.contains(teams.get(rasgeleTeam)))) {
                    if (i > rasgeleTeam) {
                        System.out.println(teams.get(i) + " vs " + teams.get(rasgeleTeam));
                        MatchMakerteams.add(teams.get(i));
                        MatchMakerteams.add(teams.get(rasgeleTeam));
                        Matches.add(teams.get(i) + "vs" + teams.get(rasgeleTeam));
                        teams.remove(i);
                        teams.remove(rasgeleTeam);
                        teamofnumber--;
                    } else {
                        System.out.println(teams.get(i) + " vs " + teams.get(rasgeleTeam));
                        MatchMakerteams.add(teams.get(i));
                        MatchMakerteams.add(teams.get(rasgeleTeam));
                        Matches.add(teams.get(i) + "vs" + teams.get(rasgeleTeam));
                        teams.remove(rasgeleTeam);
                        teams.remove(i);
                        teamofnumber--;
                    }
                }
            }
            teams.clear();
            teams.addAll(yedekteam);
            MatchMakerteams.clear();
            sayac--;
            k++;
        }
    }
}




