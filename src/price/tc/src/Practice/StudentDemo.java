package price.tc.src.Practice;

import java.util.Scanner;

public class StudentDemo {
    private String name;
    private int id;
    private double gpa;

    public StudentDemo() {
    }

    public StudentDemo(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){ return name; }
    public int  getId(){ return id; }
    public double getGpa(){ return gpa; }
//    public static double setNewPrice(double price,double tax){
//        double taxRate = (tax/100)*price;
//        double newPrice = price +taxRate;
//        return newPrice;
//    }


//    public void printOut() {
//        System.out.println("Name:"+name);
//        System.out.println("ID: "+id);
//        System.out.println("Gpa: "+gpa);
//    }
public static void main(String[] args) {
        final int Max_Item = 3;

        int balance =100;
        int numberOfItem =0;
        Scanner scanner= new Scanner(System.in);


         while(balance>0 && numberOfItem<Max_Item){
             System.out.println("you have "+balance+" to spend.");
             System.out.println("Enter price it");

         }
}
}
