package price.tc.src.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q2B {
    public static void main(String[] args) {



        //System.out.println(new int []{1,2,3,4});

       // retunWord();

//       int [] y =returnA(3,4,5);
//
//        for (int i =y.length-1;i>=0;i--){
//            System.out.println(y[i]);
//        }
        //search("java is a",'a');
        // System.out.println(search("java is a",'c'));

//
//        int [] z = {9, 2, 0, 4, 5, 1};
//        System.out.println(Arrays.toString(abc(z)));

//        int []t =tMZT(z);
//        for(int i=0;i<t.length;i++) {
//            System.out.println(t[i]);
//        }
        //sortArray(z);


        //System.out.println(computeAverage(z));
//        printNumber(z);
        //System.out.println(averagePrint(z));


//        Q2B question = new Q2B();
//        question.methodA();

    }

    public void methodA() {
        System.out.println("Method A called");
        methodB();
    }

    private void methodB() {
        System.out.println(methodC("Hello"));
        System.out.println("Method B called");
    }

    public String methodC(String text) {
        System.out.println("Method c called");
        return text + " !";
    }

    public static int [] printNumber(int [] num) {
        //num [] ={1,2,3,4};
        int i;
        int[] g =new int [num.length];
        for ( i = num.length - 1; i >= 0; i--) {
            g[i] = num[i];
//            if(x[i]>0 && x[i]<100)
        }
        return g;

    }

    public static double averagePrint(int number[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        double average = sum / number.length;
        return average;
    }

    public static int[] returnA(int a, int b, int c) {
        int[] res = {a, b, c};
        return res;
    }

    public static String arrTmz(int[] x) {
        String umd = "";
//        int [] umd = new int [x.length];
        for (int i = 0; i < x.length; i++) {
            umd += x[i];

        }
        return umd.substring(0, umd.length() - 1);
    }

    public static boolean search(String s, char ch) {
        boolean isTrue = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                isTrue = true;
        }
        return isTrue;
    }

    public static double computeAverage(double[] arr) {
        double sum = 0;
        for (double e : arr) {
            sum += e;
        }
        double average = sum / arr.length;
        return average;
    }

    public static void sortArray(double[] y) {

        for (int i = 0; i < y.length; i++) {
            for(int j=i;j<y.length;j++){
                if(y[i]>y[j]){
                    double temp = y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
            System.out.println(y[i]);
        }
    }
        public static void retunWord(){
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter text so i will give the words:");
            String text = scanner.nextLine();
        int e=0;
        int s=0;
        int wd =1;
        for (int i=0;i<text.length();i++){
            if(i==text.length()-1)
                System.out.println(text.substring(s));


            if(text.charAt(i)==' ') {
                e=i;
                System.out.println(text.substring(s,e));
                s= i+1;
                wd++;

            }

        }
            System.out.println("you have "+wd+" words");


            char [] c = new char[wd];
            for (int i =0;i<wd;i++){

            }

        }

        public static int[] tMZT(int []u){
            //int []u = {1,2,3};
        for(int i= u.length-1;i>=0;i--){
//            System.out.println(u[i]);
        }
         return u;
        }
//   public static int [] abc(int [] x){
//        for (int i= x.length-1;i>=0;i--){
//            System.out.println(x[i]);
//
//
//
//        }
//   }


}
