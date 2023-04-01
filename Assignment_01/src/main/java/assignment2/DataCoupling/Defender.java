package assignment2.DataCoupling;

public class Defender {
    FootballPlayer footballPlayer = new FootballPlayer();

    public void NewPlayer(int defence,int sprint, int shoot){
        footballPlayer.setRunningPower(sprint);
        footballPlayer.setTacklePower(defence);
        footballPlayer.setShootingPower(shoot);
    }
}
