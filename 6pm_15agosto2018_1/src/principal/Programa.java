package principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Programa {
    public static void main(String[] args) {
        //LocalDate
        //LocalTime
        //LocalDateTime
        
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2015, Month.JANUARY, 25);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss.SSS");
        
        String fecha1 = ld2.format(dtf1);
        
        LocalDate ld3 = LocalDate.parse("20-06-2010", dtf1);
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.parse("06-20-2018 18:00:00.000", dtf2);
        
        long ydiff = ChronoUnit.DAYS.between(ldt2, ldt1);
        
        System.out.println(ydiff);        
    }
    
}
