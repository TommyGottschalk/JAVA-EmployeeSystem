// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment 9- Inheritance - EmployeeBlueprints.Employee Types
// DATE: due date 11/07 -- resubmitted with fixes on 11/09
// RESOURCES: book, stackoverflow
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file holds our SalaryEmployee subclass, and all subclass specific variables and functions.
 */
package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;

/**
 * Public final SalaryEmployee class, declares all our variables that are specific to this subclass
 */
public final class SalaryEmployee extends Employee {

    double salary;


    /**
     * Constructor for SalaryEmployee. Sets variables to what they were declared in parent
     * class, but also sets s to salary
     * @param fn
     * @param ln
     * @param en
     * @param dept
     * @param job
     * @param s
     */
    public SalaryEmployee(String fn, String ln, int en, String dept, String job, double s){    //constructor
        super(fn, ln, en, dept, job, EmployeeType.SALARY);   //changed to super()
        salary = s;
    }


    /**
     * Function to calculate weekly pay. Returns salary divided by 52
     * @return
     */
    public double calculateWeeklyPay(){     //calculates weekly pay by dividing salary by 52
        return salary / 52;
    }


    /**
     * Function to calculate annual raise for SalaryEmployees. Adds 6.25% of salary to salary
     */
    public void annualRaise(){      //fixed-calculations to raise by multiplying salary by 6.25
        salary = salary + (0.0625 * salary);
    }


    /**
     * Function to determine Salary employee holiday bonus. Returns 3.365% of salary
     * @return
     */
    public double holidayBonus(){   //fixed-calculations to holiday bonus by multiplying salary by 3.365
        return 0.03365 * salary;
    }


    public void resetWeek(){    //left blank
    }


    /**
     * Setter method for employee salary. Takes in the following parameters and sets them to salary.
     * @param pay
     */
    public void setPay(double pay){ //sets salary to pay
        salary = pay;
    }

    /**
     * Method to call our toString. Also adds subclass specific variables onto the end
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + currency.format(salary);  //calls toString and adds salary at end
    }
}