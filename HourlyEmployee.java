// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment 9- Inheritance - EmployeeBlueprints.Employee Types
// DATE: due date 11/07 -- resubmitted with fixes on 11/09
// RESOURCES: book, stackoverflow
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file holds our HourlyEmployee subclass, and all subclass specific variables and functions.
 */
package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;


/**
 * Public final HourlyEmployee class, declares all our variables that are specific to this subclass
 */
public final class HourlyEmployee extends Employee {

    double wage;

    double hoursWorked;


    /**
     * First constructor that takes in the following parameters. Sets variables to what they were declared in parent
     * class, but also sets w to wage and sets hoursWorked to the default of 0
     * @param fn
     * @param ln
     * @param en
     * @param dept
     * @param job
     * @param w
     */
    public HourlyEmployee(String fn, String ln, int en, String dept, String job, double w){    //constructor
        super(fn, ln, en, dept, job, EmployeeType.HOURLY);   //changed to super()
        wage = w;
        hoursWorked = 0.0;
    }

    /**
     * Function to add time to hoursWorked. Takes the previous value of hoursWorked and adds 1
     */
    public void increaseHours(){    //function to add hours, adds one hour
        hoursWorked = hoursWorked + 1;
    }


    /**
     * Function to add a specific amount of time to hoursWorked. Takes in the following parameters, then uses if
     * statement to ensure no negative hours are added. Adds h to hoursWorked
     * @param h
     */
    public void increaseHours(double h){
        if (h > 0){                         //if statement to ensure we dont add negative hours
            hoursWorked = hoursWorked + h;
        }
    }


    /**
     * Function to calculate employee pay, with or without overtime. Declares double pay, and uses if statement to
     * determine normal work week pay, along with any additional pay received from overtime. Returns pay
     * @return
     */
    public double calculateWeeklyPay(){ //function to calculate weekly pay, if statement to determine if employee hit overtime
        double pay;
        if (hoursWorked > 40){
            pay = 40 * wage + ((1.5 * wage) * (hoursWorked - 40));
        }else {
            pay = wage * hoursWorked;
        }
        return pay;
    }


    /**
     * Function to find annualRaise. Sets wage to wage plus 5% of wage
     */
    public void annualRaise() {  //fixed function to add 5% increase in wage
        wage = wage + (0.05 * wage);
    }


    /**
     * Function to calculate holidayBonus. Takes wage * 40 and returns the value
     * @return
     */
    public double holidayBonus() {   //returns value of working full 40hr week
        return (40 * wage);
    }


    /**
     * Function to reset the work week. Resets hoursWorked to 0
     */
    public void resetWeek() {    //sets hours worked to 0
        hoursWorked = 0;
    }


    /**
     * Setter method for pay. Takes in the following parameters and sets it to wage
     * @param pay
     */
    public void setPay(double pay){ //sets wage = to pay
            wage = pay;
    }


    /**
     * Method to call our toString. Also adds subclass specific variables onto the end
     * @return
     */
    @Override
    public String toString(){   //calls toString and adds wage and hours worked
        return super.toString() + "\nWage: " + currency.format(wage) + "\nHours Worked: " + hoursWorked;
    }

}