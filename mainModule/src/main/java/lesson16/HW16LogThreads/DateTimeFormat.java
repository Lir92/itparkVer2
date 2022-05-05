package lesson16.HW16LogThreads;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormat {

    public static void main(String[] args) {

        /*

        Ниже 2 варианта выводить текущее время:

        1-ый вариант лучше использовать при многопоточности - он является immutable и поэтому безопасен при многопоточном
        использовании;

        2-й вариант можно использовать при работе с не многопоточными программами или не спользовать вообще о_О

         */

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        String formatedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("1) " + formatedDateTime);

        System.out.println("1 - inline format) " + DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").format(dateTime));


        Date date = new Date();                                   // |
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");      // | способ вывести текущую дату и время
        String currentDateAndTme = format.format(date);                             // | тоже, что и внизу, только детально
        System.out.println("2) " + currentDateAndTme);
        System.out.println("2 - inline format) " + new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date));
    }
}
