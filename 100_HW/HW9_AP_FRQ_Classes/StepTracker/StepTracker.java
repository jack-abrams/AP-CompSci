public class StepTracker{
    int stepG;
    int totalS;
    int activeD;
    int totalD;
    public stepTracker(int g){
        stepG = g;
        totalS = 0;
        activeD = 0;
        totalD = 0;
    }
    public void addDailySteps(int steps){
        totalS = totalS + steps;
        totalD = totalD + 1;
        if(steps >= stepG){
            activeD = activeD + 1;
        }
    public int activeDays(){
        return activeD;
    }
    public double averageSteps(){
        return (double) totalS/totalD;
    }
    }
}
