package price.Helloworld.src.com.ephrem;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte monthInYears = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print( " principal : ");
        int principal = scanner.nextInt();

        System.out.print(" Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/percent/monthInYears;

        System.out.print(" period in year: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthInYears;

        double mortgage = principal * ( monthlyInterest* Math.pow( 1+monthlyInterest,numberOfPayments))
                                     /(Math.pow(1+monthlyInterest, numberOfPayments)- 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print(" mortgage: " + mortgageFormatted);











    }
}