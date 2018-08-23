import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Objects {
    public static void main(String[] args) {
        LocalDate birhthday = LocalDate.of(1998,12,30);
        LocalDate now = LocalDate.now();
        long diff = ChronoUnit.DAYS.between(birhthday, now);
        int years = 80;
        double life = ((years * 0.75) * 365 + (years * 0.25) * 364);
        double percent = diff/life * 100;
        System.out.println(diff + " / " + 365*80 + " = " + percent + "%");
        System.out.printf("%d / %.0f = %4.2f ", diff, life, percent);

    }
}
