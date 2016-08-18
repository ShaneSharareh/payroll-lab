
/**
 * Employee holds Employee object
 * 
 * @author Shane Sharareh 
 * @version 3.1 - April 17, 2014 
 */
public class Employee implements Comparable
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String gender;
    private int tenure;
    private String rate;
    private double salary;

    /**
     * Employee six-arg Constructor
     * @param newFirstName First Name of Employee
     * @param newLastName Last Name of Employee
     * @param newGender Employee's Gender
     * @param newTenure Employee's tenure
     * @param newRate Employee's rate
     * @param newSalary Employee's salary
     */
    public Employee(String newFirstName, String newLastName, String newGender, int newTenure, String newRate, double newSalary )
    {
        firstName = newFirstName;
        lastName = newLastName;
        gender = newGender;
        tenure = newTenure;
        rate = newRate;
        salary = newSalary;
    }
    
    /**
     * Employee two-arg Constructor
     * @param newFirstName First Name of Employee
     * @param newLastName Last Name of Employee
     */
    public Employee(String newFirstName, String newLastName){
        firstName = newFirstName;
        lastName = newLastName;
    }
    
    /**
     * Compares Employees last name
     * @param o Employee's last name
     */
    public int compareTo(Object o){
        Employee e = (Employee) o;
        return lastName.compareTo(e.getLastName());
    }
    
    /**
     * Gets Employee's first name
     * @return Employee's first name
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * Gets Employee's last name
     * @return Employee's last name
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * Gets Employee's gender
     * @return Employee's gender
     */
    public String getGender(){
        return gender;
    }
    
    /**
     * Gets Employee's tenure
     * @return Employee's tenure
     */
    public int getTenure(){
        return tenure;
    }
    
    /**
     * Gets Employee's rate
     * @return Employee's rate
     */
    public String getRate(){
        return rate;
    }
    
    /**
     * sets Employee's salary
     * @param newSalary Salary of Employee
     */
    public void setSalary(double newSalary){
        salary = newSalary;
    }
    
    /**
     * Sets Employee's Salary
     * @return Employee's salary
     */
    public double getSalary(){
        return salary;
    }
}