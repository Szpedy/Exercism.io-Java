import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

class Gigasecond {
    private LocalDateTime localDateTime;

    Gigasecond(LocalDate moment) {
        localDateTime = moment.atTime(0,0,0);
    }

    Gigasecond(LocalDateTime moment) {
       localDateTime = moment;
    }

    LocalDateTime getDateTime() {
        LocalDateTime myBirth = LocalDateTime.of(1996,9,16,0,0,0);
        System.out.println(myBirth.plus(1_000_000_000,ChronoUnit.SECONDS));
        return localDateTime.plus(1000000000, ChronoUnit.SECONDS);
    }

}
