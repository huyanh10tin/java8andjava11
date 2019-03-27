package java8.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // local date time

        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);

        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek);      // WEDNESDAY

        Month month = sylvester.getMonth();
        System.out.println(month);          // DECEMBER

        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay);    // 1439
    }
}
