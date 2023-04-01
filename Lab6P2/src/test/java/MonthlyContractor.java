public class MonthlyContractor extends Worker{

    public MonthlyContractor(int workDay,int basewage){
        this.WorkerType = "Monthly Contractor";
        this.WorkingDays = workDay;
        this.baseWage = basewage;
    }

    @Override
    public int YearlyVacation() {
        this.yearlyVac= 21;
        return this.yearlyVac;
    }

    @Override
    public double YearlyWage() {
        this.annualWage = 12*(baseWage);
        return this.annualWage;
    }
}
