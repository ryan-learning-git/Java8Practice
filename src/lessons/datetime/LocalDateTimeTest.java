package lessons.datetime;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Locale;

public class LocalDateTimeTest {

    public void start(){
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Local DateTime : " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month.getDisplayName(TextStyle.SHORT, Locale.UK) + " day: " + day + " seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

        date3 = date3.plus(1, ChronoUnit.DECADES);
        System.out.println("Adding a decade to date3 gets us " + date3);

        LocalDate nextTuesday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next tuesday is " + nextTuesday);

        LocalDate dateFrom = LocalDate.now();
        LocalDate dateTo = dateFrom.plus(30, ChronoUnit.DAYS);
        LocalDateTime timeFrom = LocalDateTime.now();
        LocalDateTime timeTo = timeFrom.plus(30, ChronoUnit.DAYS);
        Period period = Period.between(dateFrom, dateTo);
        System.out.println("Period is " + period);
        Duration duration = Duration.between(timeFrom, timeTo);
        System.out.println("Duration is " + duration);

    }

}
