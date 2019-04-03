
public class Escort extends Spacecraft implements DefensiveCraft {
    public Escort(String shipName){
        shipRegistry = shipName;
        shipClass = "Escrt";
        hullPlating = getRndmBtwn(1000, 1250);
        shieldDschrg = getRndmBtwn(2500, 3500);
        beamPwr = getRndmBtwn(2500, 3000);
        torpedoes = getRndmBtwn(10, 20);
        super.shipStats();
    }
}
