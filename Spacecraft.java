import java.util.Random;

public abstract class Spacecraft {
    protected String shipClass;
    protected String shipRegistry;
    protected int hullPlating;
    protected int shieldDschrg;
    protected int beamPwr;
    protected int torpedoes;
    protected int getRndmBtwn(int min, int max){
        Random stat = new Random();
        int num = stat.nextInt(max - min) + min;
        return num;
    }
    protected void shipStats() {
        System.out.printf("NTSC %-12s (%-5s): " +
                        "HULL PLATING: %d | SHIELD STRENGTH: %d | BEAM POWER: %d | TORPEDOES: %d\n",
                shipRegistry, shipClass, hullPlating, shieldDschrg, beamPwr, torpedoes);
    }
}
