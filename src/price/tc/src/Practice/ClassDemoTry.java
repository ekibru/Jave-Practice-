package price.tc.src.Practice;

public class ClassDemoTry {
    public static void returnWord(String text){
        int count =1;
        text=text.trim();
        int e=0;
        int s=0;
        for(int i=0;i<text.length();i++){
            if(i==text.length()-1) {
                System.out.println(text.substring(s));
            }
            if (text.charAt(i)==' '){
                e=i;
                System.out.println(text.substring(s,e));
                count++;
                s=i+1;
            }

        }
        System.out.println("you have "+count+" words in your "+text);

    }

    public static void main(String[] args) {

        String [] k= {"a","b","c"};
        for(int i=0;i<k.length;i++){
            if(k[i].length()<=6)
                continue;
//            if(k[i].length()>6)
//                break;

            System.out.println(k[i]);
        }

        //returnWord("today is a good day ");
    }
}
