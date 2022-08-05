package price.Eggsperbasket.src.com.ephrem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfBasket, eggsPerBasKet,toTalEggs;
        Scanner keyboard = new Scanner(System.in);
        numberOfBasket = keyboard.nextInt();
        eggsPerBasKet = keyboard.nextInt();
        toTalEggs = numberOfBasket * eggsPerBasKet;
        System.out.println(" if you have "  );
        System.out.println( eggsPerBasKet + " eggs Per Basket and " );
        System.out.println( numberOfBasket +" basket, then");
        System.out.println( " the total number of egg is " + toTalEggs);
        System.out.println( " now let us take two eggs out of each basket");
        eggsPerBasKet= eggsPerBasKet - 2;
        toTalEggs = numberOfBasket * eggsPerBasKet;
        System.out.println( " you have now");
        System.out.println( eggsPerBasKet + " eggs per basket and ");
        System.out.println( numberOfBasket + " baskets ");
        System.out.println( " the new total number of eggs is " + toTalEggs);

    }
}
