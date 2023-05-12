import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday=today.minusDays(1);
        System.out.println(yesterday);
        LocalDate tommorow = today.plusDays(1);
        System.out.println(tommorow);

        String todayString =today.format(DateTimeFormatter.ISO_DATE);
        System.out.println(todayString);

        String yesterdayString = yesterday.format(DateTimeFormatter.ISO_DATE);
        today =LocalDate.parse(todayString);
        System.out.println(today);

        LocalTime todayTime = LocalTime.now();
        System.out.println(todayTime);
        LocalTime customTime = LocalTime.of(12,11,4);
        System.out.println(customTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting:"+now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(now.format(format));

        MonthDay monthDay =MonthDay.of(2,29);
        System.out.println(monthDay.isValidYear(2020));
        LocalDate date =monthDay.atYear(2024);
        System.out.println(date);


        Clock local = Clock.systemDefaultZone();
        System.out.println(local.instant());
        Clock c = Clock.systemUTC();
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c, d);
        System.out.println(clock.instant());


        ConvertET.getETCTime();

    }
}
