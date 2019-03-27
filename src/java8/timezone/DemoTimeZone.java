package java8.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime dateTimeWithZone = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println("Viet name DemoTimeZone :" + dateTimeWithZone);

    }
}
