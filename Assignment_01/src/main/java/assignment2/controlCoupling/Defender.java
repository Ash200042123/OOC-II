package assignment2.controlCoupling;

import assignment2.controlCoupling.FootballPlayer;

public class Defender {
    FootballPlayer footballPlayer = new FootballPlayer();
    public void Play(){
        footballPlayer.tackle();
        footballPlayer.run();
        footballPlayer.shoot();
    }
}
