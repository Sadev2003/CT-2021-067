package Q_04;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Q_04 {
    public static void main(String[] args) {

        /*LocalDate today = LocalDate.now();
        System.out.println(today);*/

        Date day = new Date();
        System.out.println(day);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(day));




    }
}