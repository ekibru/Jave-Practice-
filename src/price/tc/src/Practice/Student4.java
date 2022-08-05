package price.tc.src.Practice;

public class Student4 {
    private int studId;
    private double gpa;
    private String[] courses;
    private double[] grades;

    public double getGpa() {

        return gpa;
    }

    public void calGpa(double[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        this.gpa=sum/grades.length;
    }

    public static void main(String[] args) {
        int x=5;
        int y = 6;
        Test.input(x,y);

        System.out.println(x);
        System.out.println(y);

    }
    public class Test {
        public static void input(int x, double y) {
            x = 2 * x;
            y = 2 * y;
        }
    }
}
