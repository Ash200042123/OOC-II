package assignment1;
import java.util.*;
public class FactoryDate {

        List<Integer> MonthsWith30Days = Arrays.asList(4, 6, 9, 11);
        List<Integer> MonthsWith31Days = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

        Date date;

        public FactoryDate(int day, int month, int year) throws Exception {
            if (MonthsWith30Days.contains(month)) {
                if (day > 30 || day < 1) {
                    throw new Exception("Date is incorrect");
                }
                this.date = new Date(day, month, year);
                this.date.setLastDayofMonth(30);
            }
            else if (MonthsWith31Days.contains(month)) {
                if (day > 31 || day < 1) {
                    throw new Exception("Date is incorrect");
                }
                this.date = new Date(day, month, year);
                this.date.setLastDayofMonth(31);
            }
            else if (month == 2) {

                if(this.date.isLeapYear()){
                    if (day > 29 || day < 1) {
                        throw new Exception("Date is incorrect");
                    }
                    this.date = new Date(day,2, year);
                    this.date.setLastDayofMonth(29);

                }
                else{
                    if (day > 28 || day < 1) {
                        throw new Exception("Date is incorrect");
                    }
                    this.date = new Date(day,2, year);
                    this.date.setLastDayofMonth(28);
                }
            }
            else {
                throw new Exception("Month is incorrect");
            }

        }

        public String getNextDate() {
            date.nextDate();
            String str = date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
            return str;
        }

    }
