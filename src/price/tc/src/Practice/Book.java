package price.tc.src.Practice;

public class Book {
    private String name;
    private double price;

    public void setPrice(double price, double tax) {

        double taxRate = (tax/100)*price;
        double newPrice = price + taxRate;
        this.price = newPrice;

    }
    public double getPrice(){ return price;}

    public static void main(String[] args) {
//       Book tk = new Book();
//
//        char[] result = tk.convertStringToArray("helloworld");
//
//        for(int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + (i==result.length-1?" ":","));
//        }
        System.out.println( countWords("today is a good day"));



//        Book k = new Book();
//        k.setPrice(100,6);
//        System.out.println(k.getPrice());
    }
    public static char[] convertStringToArray(String word) {
        char[] result = new char[word.length()];
        for(int i = 0; i < word.length(); i++) {
            result[i] = word.charAt(i+',');
        }

        return result;
    }

    public static int countWords(String text){
        int spaceCounter = 0;
        text = text.trim();

        if(text.length() == 0){
            return 0;
        }

        else{
            for (int i = 0; i < text.length(); i++) {

                if(text.charAt(i) == ' ')
                    spaceCounter++;
            }
            int words = spaceCounter + 1;
            return words;
        }
    }

    }





