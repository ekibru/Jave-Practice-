package price.Payrool.src.com.ephrem;

import java.util.Scanner;

public class Main {
    public final int  payScale = 8;
    public static void main(String[] args) {
	int payRoll, totalHourWorked, numberOfEmployee, payScale, payroll;

        System.out.println(" please enter totalHourWorked ");

        Scanner keyboard= new Scanner(System.in);
        totalHourWorked= keyboard.nextInt();
        System.out.println(" now enter number of employee ");
        numberOfEmployee = keyboard.nextInt();

        payRoll= totalHourWorked * payScale ;
        System.out.println( payRoll );

        payroll= payRoll* numberOfEmployee;
        System.out.println( payroll);



        

    }
}
