package price.tc.src.Practice;

import java.util.Scanner;

public class Array {
    public  static char [] arrayString(String  text){
        char [] c = new char[text.length()];
        for (int i =0;i<text.length();i++){
            c[i] = text.charAt(i);

        }
        return c;
    }

    public static void main(String[] args) {

        int [] e ={6,2,8,4,6};
        int [] g = {1,2,3,5,6};

            arraySum1(e, g);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a text: ");
//        String text = scanner.next();
//        System.out.println("Enter a number: ");
//        int n = scanner.nextInt();
//        for(int i =0;i<n;i++){
//            String t = text;
//            System.out.print(t);
        }


    public static void arraySum1(int [] x,int []y){
//        int k=0;
//        if(x.length>y.length)
//            k= x.length;
//        else
//            k= y.length;

        int [] sum = new int [x.length];
        for(int i=0;i<x.length;i++){
            for(int j=i;j< y.length;j++){
                //sum[0]=x[0]+y[0];
                sum[i] = x[i]-y[i];


           }
            System.out.print(sum[i]+(i==x.length-1?" ":","));
        }




//        int  k =(int) (Math.random()*100);
//        System.out.println("K: "+k);
//        if(k%2==0)
//            System.out.println("K is even");
//        else if(k%2!=0)
//            System.out.println("K is odd");
//        else
//            System.out.println("K is not ");
        //System.out.println(k);

        //System.out.println(arrayString("hello"));
        // System.out.println( Book.convertStringToArray("lemesa"));




    }

}
