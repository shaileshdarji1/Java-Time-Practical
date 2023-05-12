import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertET {
    public static void getETCTime() {
        Scanner sc = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;
        int second;
        System.out.println("Enter Year:");
        year=sc.nextInt();
        System.out.println("Enter Month:");
        month=sc.nextInt();
        System.out.println("Enter Date");
        day=sc.nextInt();
        System.out.println("Enter Hour:");
        hour = sc.nextInt();
        System.out.println("Enter Minutes:");
        minute=sc.nextInt();
        System.out.println("Enter Second:");
        second=sc.nextInt();
        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zoned = ZonedDateTime.of(year,month,day,hour,minute,second,00,india);
        ZonedDateTime zonedDateTime = zoned.withZoneSameInstant(zoneId);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(zonedDateTime.format(format));
    }
}
