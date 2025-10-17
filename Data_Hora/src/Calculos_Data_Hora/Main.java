package Calculos_Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-02-29");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-29T01:30:26");
        Instant d06 = Instant.parse("2024-02-29T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("LocalDate - Past Week: " + pastWeekLocalDate);
        System.out.println("LocalDate - Next Week: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("LocalDateTime - Past Week: " + pastWeekLocalDateTime);
        System.out.println("LocalDateTime - Next Week: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Instant - Past Week: " + pastWeekInstant);
        System.out.println("Instant - Next Week: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
    }
}
