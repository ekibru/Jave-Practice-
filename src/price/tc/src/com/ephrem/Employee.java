package price.tc.src.com.ephrem;

public class Employee {
    public String employeeId;
    public String firstName;
    public String lastName;
    public double monthlySalary;
    public String getFullName(String firstName,String lastName,String employeeId){
        this.firstName =firstName;
        this.lastName =lastName;
        this.employeeId =employeeId;
        String name = firstName +" "+lastName;
        return name +employeeId;
    }
    public double computeAnnualSalary(double monthlySalary){
        this.monthlySalary =monthlySalary;
        double annualSalary = monthlySalary*12;
        return annualSalary;
    }
}
