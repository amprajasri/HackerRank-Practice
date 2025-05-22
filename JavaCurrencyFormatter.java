import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;
public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        
        NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
       NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
       
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String usFormat=us.format(payment);
        String indiaFormat=india.format(payment);
        String chinaFormat=china.format(payment);
        String franceFormat=france.format(payment);

        System.out.println("US: " + usFormat);
        System.out.println("India: " +indiaFormat );
        System.out.println("China: " + chinaFormat);
        System.out.println("France: " + franceFormat);
    }
}
