package price.tc.src.Practice;

public class Quize14 {
    public char[] convertStringToArray(String word) {
        char[] result = new char[word.length()];
        for(int i = 0; i < word.length(); i++) {
            result[i] = word.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

       String [] a ={ "1","2","3","4"};
        String [] b ={"a","b","c"};

        String [] c = new String [a.length+b.length];

        int i,j=0;
        for( i=0;i<a.length;i++) {
            c[i] = a[i];

            for (j = a.length + j; j < b.length; j++) {
                c[j] = b[i];
                //System.out.println(c[j]);
            }
            System.out.println(c[i]);
            System.out.println(c[j]);
            System.out.println();
            System.out.println("Length: " + c.length);
        }




//        Quize14 quiz = new Quize14();
//        char[] result = quiz.convertStringToArray("helloworld");
//
//
//        for(int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + ", ");
//        }

    }

}
