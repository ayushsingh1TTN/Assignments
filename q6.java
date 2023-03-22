import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String d1 = s.nextLine();
        String d2 = s.nextLine();
        LocalDate fd = LocalDate.parse(d1);
        LocalDate sd = LocalDate.parse(d2);
        if(fd.isAfter(sd)){
            System.out.println("First date is after the second date");
        }
        else if(fd.isBefore(sd)){
            System.out.println("First date is before the second date");
        }
        else System.out.println("First date is same as the second date");
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        System.out.println("Date and time in Madrid: "+df.format(date));
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println("Date and time in tokyo: "+df.format(date));
        df.setTimeZone(TimeZone.getTimeZone("America/Denver"));
        System.out.println("Date and time in Denver: "+df.format(date));

    }
}
