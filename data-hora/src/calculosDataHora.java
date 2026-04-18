import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosDataHora {
    static void main() {
        LocalDate d4 = LocalDate.parse("2024-04-14");
        LocalDateTime d5 = LocalDateTime.parse("2024-04-14T01:30:26");
        Instant d6 = Instant.parse("2024-04-14T01:30:26Z");

        LocalDate pastWeekLocalDate = d4.minusDays(7); // data menos 7 dias em relação a data
        LocalDate nextWeekLocalDate = d4.plusDays(7); // adiciona 7 dias em relação a data

        // para o Instant:
        Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS);
        Instant nextWeelInstant = d6.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println();
        System.out.println("pastWeekLInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeelInstant);

        System.out.println();

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d4.atTime(0,0)); //pode usar tmb a função artStardOfDay()
        Duration t2 = Duration.between(pastWeekInstant, d6); //caso invertesse a ordem dos dados, o resultado sairia negativo
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());

    }
}
