import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
    static void main() {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now(); //horário de Londres (GMT)
        LocalDate d4 = LocalDate.parse("2024-04-14");
        LocalDateTime d5 = LocalDateTime.parse("2024-04-14T01:30:26");
        Instant d6 = Instant.parse("2024-04-14T01:30:26Z");
        Instant d7 = Instant.parse("2024-04-14T01:30:26-03:00");

        LocalDate d8 = LocalDate.parse("16/04/2026", fmt1);
        LocalDateTime d9 = LocalDateTime.parse("16/04/2026 15:30", fmt2);

        LocalDate d10 = LocalDate.of(2026, 4, 16);
        LocalDateTime d11 = LocalDateTime.of(2026, 4, 16, 17, 17);

        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
        System.out.println("d3: "+d3);
        System.out.println("d4: "+d4);
        System.out.println("d5: "+d5);
        System.out.println("d6: "+d6);
        System.out.println("d7: "+d7);
        System.out.println("d8: "+d8);
        System.out.println("d9: "+d9);
        System.out.println("d10: "+d10);
        System.out.println("d11: "+d11);

    }
}
