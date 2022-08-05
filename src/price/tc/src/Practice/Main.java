package price.tc.src.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //System.out.println(Math.sqrt(4+Math.pow(2,5)) );

        int [][] y = {{1,2,3,4,5,6,7,8,9},
                      {1},
                      {2},
                      {3},
                      {4},{5},{6},{5},{8},{9}};
         for(int i = 0;i< y.length;i++){
             for (int j =0; j<y[i].length;j++) {

                 System.out.print(y[i][j]+" ");
                 System.out.print(y[i][j]*y[i][j]+" ");
             }
            // System.out.print(y[i][j]*y[i][j]+" ");
             System.out.println(" ");
         }





//       Student4 std1 = new Student4();
//       double [] z = {78,89,90,67};
//        std1.calGpa(z);
//        System.out.println(std1.getGpa());
//



//        for(int i =-1;i<6;i++){
//            System.out.print("final"+" ");
//        }

////        System.out.println(countChar("jav7n56TM"));
//        Book ellenShow = new Book();
//        ellenShow.setPrice(100,7);
//
//        System.out.println(ellenShow.getPrice());




//        StudentDemo student = new StudentDemo();
//       StudentDemo std1 = new StudentDemo("Kidane",1123,3.99);
//       StudentDemo std2 = new StudentDemo("Kebede",1124,3.95);
//       StudentDemo std3 = new StudentDemo("Alazer ",2345,3.78);
//


    }
    public static int countChar(String text){

        int count =0;
        for(int i=text.length()-1; i>0;i--){
            char c = text.toLowerCase().charAt(i);
            if(text.toLowerCase().charAt(i)==c)
                count++;
        }
        return count;
    }
}
