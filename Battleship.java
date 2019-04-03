public class Battleship extends Spacecraft implements OffensiveCraft {
    public Battleship(String shipName){
        shipRegistry = shipName;
        shipClass = "Btlsh";
        hullPlating = getRndmBtwn(3000, 5000);
        shieldDschrg = getRndmBtwn(1500, 2000);
        beamPwr = getRndmBtwn(4000, 5000);
        torpedoes = getRndmBtwn(40, 50);
        super.shipStats();
    }
}
