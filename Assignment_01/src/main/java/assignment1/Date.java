package assignment1;

public class Date {
    private int day;
    private int month;
    private int year;
    private int lastDayOfMonth;
    private int lastMonthOfYear = 12;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setLastDayofMonth(int day){
        this.lastDayOfMonth = day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void nextDate(){
        if(day == lastDayOfMonth){
            day = 1;
            if(month == lastMonthOfYear){
                month = 1;
                year++;
            }
            else {
                month++;
            }
        }
        else day++;
    }

    boolean isLeapYear(){
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }


}