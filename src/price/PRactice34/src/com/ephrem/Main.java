package price.PRactice34.src.com.ephrem;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {











        //toss();
        backward();
    }
    public static void toss(){
        Scanner scanner = new Scanner(System.in);
        String word;
        int headCount=0;
        int tailCount=0;

        System.out.println("toss your coin:");

        for(int i=1;i<=8;i++){
            System.out.print(i+" toss: ");
            word = scanner.next();
            if(!(word.equalsIgnoreCase("t"))&&!(word.equalsIgnoreCase("h"))){

                i--;
                continue;
            }
            if (word.equals("t")) {
                tailCount++;
            }
            if (word.equals("h")) {
                headCount++;
            }
        }
        System.out.println("Number of heads:"+headCount);
        System.out.println("Number of tails:"+tailCount);
        System.out.println("Percent heads:"+((double)headCount/8)*100);
        System.out.println("Percent tails: "+((double)tailCount/8)*100);

    }
    public static void backward(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();
        int temp = word.indexOf("");
        String position = word.substring(temp+1)+word.substring(0,1);


        String backWard="";

        while(!word.equalsIgnoreCase("quit")){
            boolean correctWord;
            int i;
            for( i = position.length();i>0;i--) {
                backWard = backWard+word.charAt(i);

            }

            if(backWard.charAt(i)==word.charAt(i))
                correctWord=true;

                //System.out.println("The word " + word + " do not give the same meaning when spelled backward.");
            else
                correctWord =false;
                //System.out.println("the word " + word + "  will give meaning when spelled backward");
            if (correctWord==true)
                System.out.println("The word " + word + " do not give the same meaning when spelled backward.");
            System.out.println("the word " + word + "  will give meaning when spelled backward");



            word=scanner.next();
        }
        System.out.println(backWard);
    }
}
