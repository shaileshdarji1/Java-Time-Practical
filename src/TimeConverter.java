import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class TimeConverter {
  public void convert(ZoneId zoneId){
      LocalDateTime now = LocalDateTime.now();

      ZoneOffset zoneOffSet = zoneId.getRules().getOffset(now);
      System.out.println(zoneOffSet);
      LocalTime localTime =LocalTime.now(zoneId);
      System.out.println(localTime);

      int offset = OffsetTime.now().getOffset().compareTo(zoneOffSet);
      System.out.println("Difference from Local: " + offset+"seconds");
  }
}
