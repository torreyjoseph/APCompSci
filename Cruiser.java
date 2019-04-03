public class Cruiser extends Spacecraft implements OffensiveCraft {
    public Cruiser(String shipName){
        shipRegistry = shipName;
        shipClass = "Crusr";
        hullPlating = getRndmBtwn(2000, 2500);
        shieldDschrg = getRndmBtwn(2000, 2500);
        beamPwr = getRndmBtwn(3000, 4000);
        torpedoes = getRndmBtwn(20, 35);
        super.shipStats();
    }
}
