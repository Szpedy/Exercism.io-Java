import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


class Gigasecond {
    private LocalDateTime localDateTime;
    private static final long gigasecond = 1_000_000_000;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        localDateTime = moment;
    }

    LocalDateTime getDateTime() {
        return localDateTime.plus(gigasecond, ChronoUnit.SECONDS);
    }

}
