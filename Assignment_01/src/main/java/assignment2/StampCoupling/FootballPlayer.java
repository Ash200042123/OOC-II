package assignment2.StampCoupling;

public class FootballPlayer {
    private int tacklePower,runningPower,shootingPower;

    public void setTacklePower(int x){
        this.tacklePower=x;
    }
    public void setRunningPower(int x){
        this.runningPower=x;
    }
    public void setShootingPower(int x){
        this.shootingPower=x;
    }

    public int getRunningPower() {
        return runningPower;
    }

    public int getShootingPower() {
        return shootingPower;
    }

    public int getTacklePower() {
        return tacklePower;
    }
}
