package assignment2.StampCoupling;

import assignment2.StampCoupling.FootballPlayer;

public class Defender {
    private int tacklePower,runningPower,shootingPower;
    public Defender(FootballPlayer footballPlayer){
        this.runningPower=footballPlayer.getRunningPower();
        this.tacklePower=footballPlayer.getTacklePower();
        this.shootingPower=footballPlayer.getShootingPower();
    }

    public int getTacklePower() {
        return tacklePower;
    }

    public int getShootingPower() {
        return shootingPower;
    }

    public int getRunningPower() {
        return runningPower;
    }
}
