package java8.time;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DemoTime {
        public static void main(String[] args) {
            var time = TimeUnit.DAYS.convert(Duration.ofHours(24));
            System.out.println(time == 1); // true
            System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(26))); // 1
            System.out.println(TimeUnit.MINUTES.convert(Duration.ofSeconds(60))); // 1

        }
}
