package assignment2.contentCoupling;

import assignment2.contentCoupling.FootballPlayer;

public class Defender {
    public void Influence(FootballPlayer player){
        player.setPerformance(player.getSuccessfulTackle()*100+ player.getGoals()*80+ player.getSuccessfulDribble()*10);
        if(player.getPerformance()>800){
            System.out.println("Excellent Game!\n");
        }
        else if(player.getPerformance()>500 && player.getPerformance()<800){
            System.out.println("Good Game!\n");
        }
        else System.out.println("Not a Good game!");
    }
}
