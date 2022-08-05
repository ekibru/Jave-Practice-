package price.FizzBuzz.src.com.ephrem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Enter Number:");
        int number = keyboard.nextInt();

        if ( (number %5==0 ) && (number %3==0))
            System.out.println(" FizzBuzz");
        else if ( number % 3==0)
            System.out.println("BUzz");
        else if( number % 5==0)
            System.out.println("Fizz");
        else
            System.out.println(number);

    }
}
