package com.cherednik;
/*
4*. Задана строка с датой вида "22.01.2019 19:15:00". Написать метод который преобразовывает ее в
формат "22 Jan, 7:15 PM". Предусмотреть обработку ситуации если входящая дата в недопустимом формате.
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime {

    private static final String DATE = "22.01.2019 19:15:00";
    private static final String DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";
    private static final String OUTPUT_DATE_FORMAT = "d MMM, h:mm a";

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDateTime date = null;
        try {
            date = LocalDateTime.parse(DATE, formatter);
        } catch (Exception e) {
            System.out.println("Unsupported date format, please use " + DATE_FORMAT + " format");
        }
        assert date != null;
        System.out.println(formatDateTime(date));

    }
    private static String formatDateTime(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(OUTPUT_DATE_FORMAT, Locale.US);
        return date.format(formatter);
    }
}
