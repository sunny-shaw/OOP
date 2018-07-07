package tw;

/**
 * Created by arshisa on 7/5/18.
 */
public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        static boolean isWeekend(DaysOfWeek day){
            return day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY;
        }
    }


