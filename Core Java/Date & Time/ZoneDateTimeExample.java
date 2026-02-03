import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeExample {

    public static void main(String[] args) {

        // create LocalDateTime
        LocalDateTime ldt =
            LocalDateTime.parse(
                "2023-04-20 21:09",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            );

        // create zone
        ZoneId zone = ZoneId.of("Africa/Cairo");

        // create ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.of(ldt, zone);

        // convert to UTC
        ZonedDateTime utc = zdt.withZoneSameInstant(ZoneId.of("UTC"));

        // formatter
        DateTimeFormatter f =
            DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a z");

        // output
        System.out.println(zdt.format(f));
        System.out.println(utc.format(f));
    }
}
