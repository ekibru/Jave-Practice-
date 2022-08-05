package price.volume.src.com.ephrem;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sale walmart = new Sale();
        walmart.totalSale = 900;
        walmart.costPerItem =19.99;
        walmart.bulkQuantity = 12;
        walmart.saleNumber = 30;
        walmart.totalDiscount = 6;
        walmart.bulkDiscountPercentage=.25;
        walmart.registerSale(4);
        System.out.println("Walmart Sale Report");
        System.out.println("____________________");
        walmart.displaySale();
        //System.out.println(findMax(20,10,6));

    }
//    public static int findMax(int x, int y,int z){
//        int max;
//        if(x>y&&x>z)
//            max =x;
//        else if(y>x && y>z)
//            max=y;
//        else
//            max =z;
//        return max;

    //}
}