package price.tc.src.com.ephrem;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {












//        System.out.println("Enter a number:");
//        int a = scanner.nextInt();
//
//
//        switch (a){
//            case 1:
//                System.out.println("It is Monday");
//                break;
//            case 2:
//                System.out.println("it is Tuesday");
//                break;
//            case 3:
//                System.out.println("It is wednesday");
//                break;
//            case 4: System.out.println("It is Thusrsday");
//                break;
//            case 5: System.out.println("It is Friday");
//                break;
//            case 6: System.out.println("It is Saturday");
//                break;
//            case 7: System.out.println("It is Sunday");
//                break;
//            default: System.out.println("Invalid input");
//        }




        //int y = sumOdd(10);
        //System.out.println(y );

        //System.out.println(letterCount("jav76ter"));


//        StudentDemo std1 = new StudentDemo();
//
//        std1.printInfo("Dean",1113,4.00);
//        String name ="llllllll";
//        name.toLowerCase();

//     int [] k = {1,2,3,4,8,9};
//        System.out.println(printOut(k));
//        int [] k =number(4,5,6);
//        for(int i =0;i< k.length;i++){
//            System.out.println(k[i]);
//        }
//
//        System.out.println(k);

    }
    public static double printOut(int[] num){
        int average=0;
        for(int i =0;i< num.length;i++){
            average +=average ;
        }
        return average/num.length;


    }

    public static int sumOdd(int x){
        int sum = 0;
        int i=1;
        while(i<=x){
            sum+=i;
            i+=2;
        }
        return sum;
    }

}
