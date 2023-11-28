// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment 9- Inheritance - EmployeeBlueprints.Employee Types
// DATE: due date 11/07 -- resubmitted with fixes on 11/09
// RESOURCES: book, stackoverflow
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file holds our CommissionEmployee subclass, and all subclass specific variables and functions.
 */
package EmployeeObjects;
import EmployeeBlueprints.Employee;
import EmployeeBlueprints.EmployeeType;

/**
 * Public final CommissionEmployee class, declares all our variables that are specific to this subclass
 */
public final class CommissionEmployee extends Employee {

    double sales;

    double rate;


    /**
     * Constructor for Commission Employee. Sets variables to what they were declared in parent
     * class, but also sets r to rate and sales to 0.0
     * @param fn
     * @param ln
     * @param en
     * @param dept
     * @param job
     * @param r
     */
    public CommissionEmployee(String fn, String ln, int en, String dept, String job, double r){
        super(fn, ln, en, dept, job, EmployeeType.COMMISSION);   //changed to super()
        rate = r;
        sales = 0.0;
    }

    /**
     * Function to increase sales of Commission Employee. Adds 100 to the current sales amount
     */
    public void increaseSales(){    //adds 100 to current sales count
        sales = sales + 100;
    }


    /**
     * Function to add a specific amount of sales to Commission Employee. If statement to ensure no negative sales are
     * added. Then adds s to sales
     * @param s
     */
    public void increaseSales(double s){ //if statement to ensure no negative hours are added, adds s tpo sales
        if (s > 0) {
            sales = sales + s;
        }
    }


    /**
     * Function to calculate weekly pay of Commission Employee. Returns rate * sales
     * @return
     */
    public double calculateWeeklyPay(){ //calculates weekly pay by multiplying rate by sales
        return rate * sales;
    }


    /**
     * Function to add raise to Commission Employee. Returns the current rate plus .002
     */
    public void annualRaise(){  //adds .002 to the current rate
        rate = rate + .002;
    }


    /**
     * No holiday bonus for Commission Employee's. Returns 0
     * @return
     */
    public double holidayBonus(){   //no holiday bonus, returns 0
        return 0;
    }


    /**
     * Function to reset the week for Commission Employee's. Resets sales to 0
     */
    public void resetWeek(){    //resets sales to 0.0
        sales = 0.0;
    }


    /**
     * Setter for Commission employee pay. Takes on the following parameter and sets it to rate
     * @param pay
     */
    public void setPay(double pay){ //declares rate variable to what was sent(pay)
        rate = pay;
    }

    /**
     * Method to call our toString. Also adds subclass specific variables onto the end
     * @return
     */
    @Override
    public String toString(){
        //calls toString and adds rate and sales
        return super.toString() + "\nRate: " + percent.format(rate) + "\nSales: " + currency.format(sales);
    }
}