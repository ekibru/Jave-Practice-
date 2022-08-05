package price.volume.src.com.ephrem;

public class EmployeeSalary {
    public static String name="";
    public static String breed="";
    public static int age=0;
    public static void printOut(){
        System.out.println("Name:"+name);
        System.out.println("Breed:"+breed);
        System.out.println("Age:"+age);
//        System.out.println("human age:");
        System.out.println();

    }
    public static int getAge(){
        int humanAge = age*4;
        return humanAge;
    }


}
