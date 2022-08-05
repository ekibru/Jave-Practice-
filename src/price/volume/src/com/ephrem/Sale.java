package price.volume.src.com.ephrem;

public class Sale {
    public double saleNumber;
    public double totalSale;
    public double totalDiscount;
    public double costPerItem;
    public int bulkQuantity;
    public double bulkDiscountPercentage;

    public double registerSale(double n){
        if(n>bulkQuantity)
            costPerItem=costPerItem-bulkDiscountPercentage;

        return costPerItem;
    }
    public void displaySale(){
        System.out.println("Number sold:"+saleNumber);
        System.out.println("Total sale:"+totalSale);
        System.out.println("Total Discount:"+totalDiscount);
        System.out.println("Cost per item: "+costPerItem);

    }
}
