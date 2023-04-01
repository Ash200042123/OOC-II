public class Permanent extends Worker{

    public Permanent( int workDay,int basewage){
        this.WorkerType = "Permanent";
        this.WorkingDays = workDay;
        this.baseWage = basewage;
    }

    @Override
    public int YearlyVacation() {
        double x=20 +(WorkingDays*0.03);
        this.yearlyVac= (int) x;
        return this.yearlyVac;
    }

    @Override
    public double YearlyWage() {
        this.annualWage = 12*(baseWage*3.3);
        return this.annualWage;
    }
}
