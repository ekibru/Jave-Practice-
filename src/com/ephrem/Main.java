package com.ephrem;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int monthInYear = 12;
        final double annualInterestRate = 0.23;
        double interest;
        double monthlyInterest ;
        double balance ;


        Scanner scanner = new Scanner(System.in);
        monthlyInterest = annualInterestRate / monthInYear;
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        System.out.println("What would you like to do: deposit or withdrawal");
        String selection = scanner.nextLine();
            if(selection.equalsIgnoreCase("deposit")){
                System.out.println("How much:");
                balance = scanner.nextDouble();
                for(int i =0;i<12;i++)
                {
                    interest = balance * monthlyInterest;
                    balance = balance + interest;
                    System.out.println(month[i] + ":" + (int)balance);
                }
            }else if(selection.equalsIgnoreCase("withdrawal")){
                System.out.println("How much");
                balance = scanner.nextDouble();
                for(int i =0;i<12;i++)
                {
                    interest = balance * monthlyInterest;
                    balance = balance - interest;
                    System.out.println(month[i] + ": " + (int)balance);
                }
        }else
                System.out.println("You made a wrong selection.please select withdrawal or deposit.");

        }
    }

