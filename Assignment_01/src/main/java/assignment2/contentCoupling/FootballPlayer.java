package assignment2.contentCoupling;

public class FootballPlayer {
    private int successfulTackle, successfulDribble,Goals,performance;

    public void setSuccessfulTackle(int x){
        this.successfulTackle=x;
    }
    public void setSuccessfulDribble(int x){
        this.successfulDribble=x;
    }
    public void setGoals(int x){
        this.Goals=x;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getSuccessfulDribble() {
        return successfulDribble;
    }

    public int getGoals() {
        return Goals;
    }

    public int getSuccessfulTackle() {
        return successfulTackle;
    }

    public int getPerformance() {
        return performance;
    }
}
