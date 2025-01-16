
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesExample {
    public static void main(String[] args) {
        // Define ZoneIds for GMT, IST, and PST
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        // Get current time in each ZoneId
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        // Define a formatter for displaying time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Print times in the specified zones
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
