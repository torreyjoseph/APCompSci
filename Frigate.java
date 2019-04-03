public class Frigate extends Spacecraft implements DefensiveCraft {
    public Frigate(String shipName){
        shipRegistry = shipName;
        shipClass = "Frgte";
        hullPlating = getRndmBtwn(1500, 2000);
        shieldDschrg = getRndmBtwn(2000, 2500);
        beamPwr = getRndmBtwn(2500, 3500);
        torpedoes = getRndmBtwn(20, 30);
        super.shipStats();
    }
}