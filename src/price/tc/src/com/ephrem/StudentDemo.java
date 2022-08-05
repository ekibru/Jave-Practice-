package price.tc.src.com.ephrem;

public class StudentDemo {
    String name;
    int id;
    double gpa;

    public void printInfo(String name,int id,double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        System.out.println(name+" who has id #"+id+"  scored a gpa of "+gpa+" and it is the highest of all.");

    }




}
