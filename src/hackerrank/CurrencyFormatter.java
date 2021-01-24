package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyFormatter {
    private static double number = 12324.134;

    public static void main(String[] args) {
        System.out.println("Hello World");

        CurrencyFormatter.currencyFormat(number);
    }


    public static void currencyFormat(double payment) {
        System.out.println(payment);

        NumberFormat us = NumberFormat.getInstance(Locale.US);

        NumberFormat china = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(us.format(payment));
        String usformat = us.format(payment);
        System.out.println(usformat);

    }
}
