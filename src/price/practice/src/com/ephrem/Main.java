package price.practice.src.com.ephrem;


import java.util.Arrays;
import java.util.Scanner;





    public class Main {
        public static void main(String[] args)
        {
            int score,grade;
            Scanner keyboard = new Scanner(System.in);
            System.out.print(" Enter Score :");
            score = keyboard.nextInt();


            if ( score >= 90)
            {
                System.out.println("grade = A");}
            else if (( score >= 80) && ( score <90) )
            {
                System.out.println(" grade = B");
            }
            else if (( score >= 70) && ( score <80))
            {
                System.out.println(" grade = C");
            }
            else if (( score >= 60) && ( score <70))
            {
                System.out.println(" grade = D");
            }
            else
            {System.out.println("grade =F"); }


        }


    }



