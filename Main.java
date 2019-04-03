import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nTactical Fleet Roster:\n* * * * * * * * * * *");
        ArrayList<Spacecraft> starFleet = new ArrayList<>();
        starFleet.add(new Escort ("Gagarin"));
        starFleet.add(new Escort("Tereshkova"));
        starFleet.add(new Escort("Armstrong"));
        starFleet.add(new Escort("Aldrin"));
        starFleet.add(new Escort ("Méndez"));
        starFleet.add(new Frigate("Danube"));
        starFleet.add(new Frigate("Mississippi"));
        starFleet.add(new Frigate("Rio Grande"));
        starFleet.add(new Frigate("Mekong"));
        starFleet.add(new Frigate("Volga"));
        starFleet.add(new Cruiser("Andromeda"));
        starFleet.add(new Cruiser("Carina"));
        starFleet.add(new Cruiser("Hercules"));
        starFleet.add(new Cruiser("Cepheus"));
        starFleet.add(new Cruiser("Cassiopeia"));
        starFleet.add(new Battleship("Aegis"));
        starFleet.add(new Battleship("Valiant"));
        starFleet.add(new Battleship("Gallant"));
        starFleet.add(new Battleship("Endurance"));
        starFleet.add(new Battleship("Resolute"));

        System.out.println("\nDefensive Fleet:\n* * * * * * * * *");
        ArrayList<DefensiveCraft> defFleet = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int totStat = 0;
            int max = 0;
            for (int j = 0; j < starFleet.size(); j++) {
                if ((starFleet.get(j).hullPlating + starFleet.get(j).shieldDschrg) > totStat && starFleet.get(j) instanceof DefensiveCraft) {
                    totStat = starFleet.get(j).hullPlating + starFleet.get(j).shieldDschrg;
                    max = j;
                }
            }
            defFleet.add((DefensiveCraft) starFleet.remove(max));
        }

        System.out.println("\nOffensive Fleet:\n* * * * * * * * *");
        ArrayList<OffensiveCraft> offFleet = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int totStat = 0;
            int max = 0;
            for (int j = 0; j < starFleet.size(); j++) {
                if ((starFleet.get(j).hullPlating + starFleet.get(j).shieldDschrg) > totStat && starFleet.get(j) instanceof DefensiveCraft) {
                    totStat = starFleet.get(j).hullPlating + starFleet.get(j).shieldDschrg;
                    max = j;
                }
            }
            offFleet.add((OffensiveCraft) starFleet.remove(max));
        }
        /*for (OffensiveCraft ship : offFleet) {
            ship.shipStats();
        }*/
    }
}
