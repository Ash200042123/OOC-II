

public class DayLabourer extends Worker{

    public DayLabourer(int workDay,int basewage){
        this.WorkerType = "DayLabourer";
        this.WorkingDays = workDay;
        this.baseWage = basewage;
    }
    @Override
    public int YearlyVacation() {
    this.yearlyVac=0;
        return this.yearlyVac;
    }

    @Override
    public double YearlyWage() {
        this.annualWage = 12*(WorkingDays*baseWage/25);
        return this.annualWage;
    }
}
