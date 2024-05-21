package session9_tdd;

import java.util.Date;

public class NextDayCalculator {
    public static Date getNextDay(Date day){
        Date nextday = new Date(day.getTime() + 24*60*60*1000);
        return nextday;
    }
}
