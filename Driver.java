import java.io.*;
import java.util.Scanner;
/**
 * Driver for the Payroll class invokes methods used for mainting the Employee list.
 * 
 * @author Shane Sharareh 009059009 
 * @version 3.1 - April 17, 2014
 */
public class Driver
{
    /**
     * Invokes the payroll methods using a payroll object to correctly manage the Employee list
     */
    public static void main(String[]args) throws IOException{
        PrintWriter pw = new PrintWriter( new FileWriter("csis.txt"));
        Payroll payroll = new Payroll(pw);
        payroll.setEmployees();
        payroll.header();
        payroll.outputEmployees();
        payroll.outputNumberOfEmployees();
        payroll.outputWomenEmployees();
        payroll.outputWeeklySalary();
        payroll.giveRaise();
        payroll.sortEmployees();
        payroll.hire();
        payroll.fire();
        payroll.outputNewEmployees();
        pw.close();
    }
}
        