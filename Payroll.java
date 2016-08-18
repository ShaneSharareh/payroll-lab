import java.io.*;
import java.util.Scanner;
import java.lang.Math;
/**
 * Payroll manages the Employee list.
 * 
 * @author Shane Sharareh 
 * @version 3.1 - April 17, 2014 
 */
public class Payroll
{
    // instance variables - replace the example below with your own
    private ObjectList list = new ObjectList(); 
    private PrintWriter pw;
    /**
     * Payroll one-arg constructor
     * @param newPw printwriter object used to write data into a text file
     */
    public Payroll(PrintWriter newPw)
    {
        pw = newPw;
        
    }
    
    /**
     * Assigns the employees to a employee object and inserts it into a list.
     */
    public void setEmployees()throws IOException{
        Scanner payfile = new Scanner(new File("payfile.txt"));
         while(payfile.hasNextLine()){ 
            String readPayFile = payfile.nextLine();
            String[] employeeInput = readPayFile.split("[ ]+");
            String firstName =employeeInput[0];
            String lastName = employeeInput[1];
            String gender = employeeInput[2];
            int tenure = Integer.parseInt(employeeInput[3]);
            String rate = (employeeInput[4]);
            double salary = Double.parseDouble(employeeInput[5]);
            Employee newEmployee = new Employee(firstName, lastName, gender, tenure, rate, salary);
            list.addLast(newEmployee);
        }
    }
    
    /**
     * Prints the header for the Employees
     */
    public void header(){
        System.out.println("Employee List:");
        System.out.format( "%-15s %-14s %-11s %-11s %-9s%s\n","First Name", "Last Name","Gender","Tenure","Rate","Salary");
        pw.println("Employee List:\n");
        pw.printf( "%-15s %-14s %-11s %-11s %-9s%s","First Name", "Last Name","Gender","Tenure","Rate","Salary");
        pw.println("\n");
    }
    
    /**
     * Print's out the Employees in the list
     */
    public void outputEmployees(){
        ObjectListNode p = list.getFirstNode();
        Employee newEmployee;
        while(p!= null){
           newEmployee = (Employee)p.getInfo();
           System.out.printf( "%-15s %-16s %-12s %-9d %-8s%.2f\n",newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getGender(),
           newEmployee.getTenure(),newEmployee.getRate(),newEmployee.getSalary());
           pw.printf( "%-15s %-16s %-12s %-9d %-8s%.2f",newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getGender(),
           newEmployee.getTenure(),newEmployee.getRate(),newEmployee.getSalary());
           pw.println("\n");
           p = p.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
        }
        
    /**
     *Output's the number of Employees
     */
    public void outputNumberOfEmployees(){
        System.out.println("Number of Employees: "+ list.size());
        pw.println("Number of Employees: "+ list.size() + "\n");
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
    }
    
    /**
     * Output's the women Employees
     */
    public void outputWomenEmployees(){
        ObjectListNode p = list.getFirstNode();
        Employee newEmployee;
        System.out.println("Female Employees: ");
        System.out.println("First Name:");
        pw.println("Female Employees: ");
        pw.println("First Name:" );
        while(p!= null){
            newEmployee = (Employee)p.getInfo();
           if(newEmployee.getGender().equals("F")){
           System.out.println(newEmployee.getFirstName());
           pw.println(newEmployee.getFirstName());
        }
            p = p.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
        }
    
    /**
     * Outputs Employees with a weekly salary greater than $350,000 per year and a tenure greater than 5
     */
    public void outputWeeklySalary(){
        ObjectListNode p = list.getFirstNode();
        Employee newEmployee;
        System.out.println("Weekly Salary: " );
        System.out.printf( "%-15s %-14s %s \n", "First Name", "Last Name", "Salary");
        pw.println("Weekly Salary: " );
        pw.printf( "%-15s %-14s %s", "First Name", "Last Name", "Salary");
        pw.println("\n");
        while(p!= null){
            newEmployee = (Employee)p.getInfo();
            if((newEmployee.getSalary()*52)>35000.00&& newEmployee.getTenure()>=5){
                System.out.printf( "%-15s %-14s %.2f\n",newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getSalary());
                pw.printf( "%-15s %-14s %.2f",newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getSalary());
                pw.println("\n");
            }
            p = p.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
            }
    
    /**
     * Gives $.75 raise to Employees who make less than $10 per hour and gives a $50 raise to Employees who make less than $350 per week 
     */
    public void giveRaise(){
        ObjectListNode p = list.getFirstNode();
        Employee newEmployee;
        System.out.println("Employees Raise: ");
        pw.println("Employees Raise: ");
        System.out.printf( "%-15s %-14s %s\n","First Name", "Last Name"," Salary");
        pw.printf( "%-15s %-14s %s","First Name", "Last Name"," Salary");
        pw.println("\n");
        while(p!= null){
            newEmployee = (Employee)p.getInfo();
            if(newEmployee.getRate().equals("H") && newEmployee.getSalary()<10.00 )
                {
                    double newSalary = newEmployee.getSalary()+.75;
                    newEmployee.setSalary((double)Math.round(newSalary * 100) / 100);
                    System.out.printf( "%-15s %-16s %.2f\n",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
                    pw.printf( "%-15s %-16s %.2f",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
                    pw.println("\n");
                }
            else if(newEmployee.getRate().equals("W") && newEmployee.getSalary()<350.00)
                {
                    double newSalary = newEmployee.getSalary()+50.00;
                    newEmployee.setSalary((double)Math.round(newSalary * 100) / 100);
                    System.out.printf( "%-15s %-16s %.2f\n",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
                    pw.printf( "%-15s %-16s %.2f",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
                    pw.println("\n");
            }
            p = p.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
            }
    
     /**
      * Sorts Employees by their last name
      */
    public void sortEmployees(){
        ObjectList tempList = new ObjectList();
        Employee newEmployee;
        ObjectListNode p = list.getFirstNode();
        while(p != null){
            newEmployee = (Employee)p.getInfo();
            tempList.insert(newEmployee);
            p = p.getNext();
        }
        list = tempList;
        ObjectListNode q = list.getFirstNode();
        System.out.println("Ordered Employees:");
        pw.println("Ordered Employees: \n");
        System.out.printf( "%-15s %-14s %s\n","First Name", "Last Name", "Salary");
        pw.printf( "%-15s %-14s %s","First Name", "Last Name", "Salary");
        pw.println("\n");
        while(q!= null){
           newEmployee = (Employee)q.getInfo();
           System.out.printf( "%-15s %-14s %.2f\n",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
           pw.printf( "%-15s %-14s %.2f",newEmployee.getFirstName(), newEmployee.getLastName(),newEmployee.getSalary());
           pw.println("\n");
           q = q.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
    }
    
    /**
     * Hires new Employees
     */
    public void hire()throws IOException{
        Scanner hireFile = new Scanner(new File("hirefile.txt"));
         while(hireFile.hasNextLine()){  
            String readHireFile = hireFile.nextLine();
            String[] employeeInput = readHireFile.split("[ ]+");
            String firstName =employeeInput[0];
            String lastName = employeeInput[1];
            String gender = employeeInput[2];
            int tenure = Integer.parseInt(employeeInput[3]);
            String rate = (employeeInput[4]);
            double salary = Double.parseDouble(employeeInput[5]);
            Employee newEmployee = new Employee(firstName, lastName, gender, tenure, rate, salary);
            list.insert(newEmployee);
        }
        System.out.println("Hiring new Employees..");
        System.out.println();
        System.out.println("Updated Employee List:");
        System.out.printf( "%-15s %s\n","First Name", "Last Name");
        pw.println("Hiring new Employees..");
        pw.println("\n");
        pw.println("Updated Employee List: \n");
        pw.printf( "%-15s %s","First Name", "Last Name");
        pw.println("\n");
        ObjectListNode q = list.getFirstNode();
        while(q!= null){
        Employee newEmployee = (Employee)q.getInfo();    
        System.out.printf( "%-15s %s\n",newEmployee.getFirstName(), newEmployee.getLastName());
        pw.printf( "%-15s %s",newEmployee.getFirstName(), newEmployee.getLastName());
        pw.println("\n");
        q = q.getNext();
        }
        System.out.println();
        System.out.println();
        pw.println("\n");
        pw.println("\n");
    }
    
    /**
     * Fires Employees
     */
    public void fire()throws IOException{
        Scanner fireFile = new Scanner(new File("firefile.txt"));
        System.out.println("Firing Employees..");
        pw.println("Firing Employees.. \n");
        ObjectList fireList = new ObjectList();
         while(fireFile.hasNextLine()){ 
            String readFireFile = fireFile.nextLine();
            String[] employeeInput = readFireFile.split("[ ]+");
            String firstName =employeeInput[0];
            String lastName = employeeInput[1];
            Employee newEmployee = new Employee(firstName, lastName);
            fireList.insert(newEmployee);
            
        }
        ObjectListNode p = fireList.getFirstNode();
        while(p!=null){
            Employee newEmployee = (Employee)p.getInfo();
            list.remove(newEmployee);
            p = p.getNext() ;
        }
        System.out.println();
        sortNewEmployees();
        pw.println("\n");
    }
    
    /**
     * Sorts the updated Employee list
     */
     public void sortNewEmployees(){
        ObjectList tempList = new ObjectList();
        Employee newEmployee;
        ObjectListNode p = list.getFirstNode();
        while(p != null){
            newEmployee = (Employee)p.getInfo();
            tempList.insert(newEmployee);
            p = p.getNext();
        }
        list = tempList;
    }
/**
 *Prints a updated Employee list 
 */
public void outputNewEmployees(){
        ObjectListNode p = list.getFirstNode();
        Employee newEmployee;
        System.out.println("Updated Employee List:");
        pw.println("Updated Employee List: \n");
        System.out.printf( "%-15s %s\n","First Name", "Last Name");
        pw.printf( "%-15s %s","First Name", "Last Name");
        pw.println("\n");
        while(p!= null){
           newEmployee = (Employee)p.getInfo();
           System.out.printf( "%-15s %s\n",newEmployee.getFirstName(),newEmployee.getLastName());
           pw.printf( "%-15s %s",newEmployee.getFirstName(),newEmployee.getLastName());
           pw.println("\n");
           p = p.getNext();
        }
    }
}