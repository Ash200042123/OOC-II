package assignment2.controlCoupling;

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

    public void tackle() {
        if(this.tacklePower>50) System.out.println("Successful Tackle\n");
        else System.out.println("Couldn't tackle\n");
    }

    public void run() {
        if(this.runningPower>50) System.out.println("Running with speed" + this.runningPower + "\n");
        else System.out.println("Failed to run\n");
    }

    public void shoot() {
        if(this.shootingPower>75) System.out.println("Fiery Shot\n");
        else if (this.shootingPower>50 && this.shootingPower<76) {
            System.out.println("Nice Shot\n");
        } else System.out.println("Couldn't Shoot\n");
    }
}
