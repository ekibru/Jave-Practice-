package price.tc.src.com.ephrem.Assignment;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new String("fpp");
        String t = s;
        String x = new String("fpp");
//        System.out.println(s.equals(t));
//        System.out.println(s==t);
//        System.out.println(s.equals(x));
//        System.out.println(s==x);









//        RatingScore blackPanter = new RatingScore();
//        blackPanter.setDescription("movie","in box office out of Top 10 ");
//        blackPanter.setRating("Black panter movie is on 1 st place ");
//        System.out.println(blackPanter.display());
//
//        RatingScore product = new RatingScore();
//        product.setDescription("Starbucks employee performance rating","8 out 0f 10");
//        product.setRating("Ephrem Starbucks employee got a rating ");
//        System.out.println(product.display());









        PersonAddress kevin = new PersonAddress();
        kevin.accessInfo("Blen","Kidane","kv@yahoo.com","645-8907");


        System.out.println("Full name:"+kevin.getFirstName()+" "+kevin.getLastName()+"\n"
                            +"Email: "+kevin.getEmailAddress()+"\n"+"Phone number: "+kevin.getPhoneNumber());
        kevin.changeEmailAddress("kv76@gmail.com");
        kevin.changePhoneNumber("345-9087");
        System.out.println("***************************");
        System.out.println("New Email:"+kevin.getEmailAddress()+"\n"+"New phone number: "+kevin.getPhoneNumber());

    }
}
