import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        String text = "  Never forget what you are, for surely the world will not\n ";
        LocalDate dateFrom = LocalDate.of(2022, Month.FEBRUARY, 24);
// По дату
        LocalDate dateTo = LocalDate.of(2022, Month.JUNE, 26);
// Количество дней между этими датами
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);


    }
}
