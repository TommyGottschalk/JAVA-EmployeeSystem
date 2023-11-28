// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment7-EmployeeBlueprints.Employee System
// DATE: 10/24-turned in 10/26
// RESOURCES: book, stack overflow, MCC tutor
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file stores the employee parent class and holds the functions that are applicable to ALL subclasses
 */
package EmployeeBlueprints;
import java.util.ArrayList;


/**
 * Public abstract employee class, declares all our variables that are used by each class
 */
public abstract class Employee implements Printable {     //creating our class, and declaring all variables
    String firstName;
    String lastName;
    int employeeNum;
    String department;
    String jobTitle;
    EmployeeType employeeType;
    ArrayList<EmergencyContact> emergencyContacts;  //declaring new arraylist

    /**
     * First constructor, takes in the following parameters and assigns them to the listed variables
     * @param fn
     * @param ln
     * @param en
     * @param dept
     * @param job
     * @param et
     */
    public Employee(String fn, String ln, int en, String dept, String job, EmployeeType et) {     //first constructor
        firstName = fn;
        lastName = ln;      //declaring our variables to what was passed to them
        employeeNum = en;
        department = dept;
        jobTitle = job;
        employeeType = et;

        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
    }


    /**
     * Second constructor, takes in the following parameters and assigns them to the listed variables, leaves both
     * department and jobTitle blank
     * @param fn
     * @param ln
     * @param en
     * @param et
     */
    public Employee(String fn, String ln, int en, EmployeeType et) {     //2nd constructor
        firstName = fn;
        lastName = ln;      //declaring variables to what was passed to them, but leaving department and job title blank
        employeeNum = en;
        department = "";
        jobTitle = "";
        employeeType = et;


        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
    }


    /**
     * Third constructor, takes in the following parameter and uses it to retrieve other variables from employee e
     * @param e
     */
    public Employee(Employee e) {       //3rd constructor
        firstName = e.getFirstName();
        lastName = e.getLastName();     //gets the information for employee e
        employeeNum = e.getEmployeeNumber();
        department = e.getDepartment();
        jobTitle = e.getJobTitle();
        employeeType = e.getEmployeeType();

        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
    }


    /**
     * Fourth constructor, sets all values to default or 0
     *
     */
    public Employee() {     //4th constructor
        firstName = "";
        lastName = "";      //all values set to blank or 0
        employeeNum = 0;
        department = "";
        jobTitle = "";
        employeeType = EmployeeType.HOURLY;

        emergencyContacts = new ArrayList<EmergencyContact>();
        percent.setMaximumFractionDigits(3);
    }


    /**
     * Getter method for employee firstName, returns first name
     * @return
     */
    public String getFirstName() {   //Getter for employee first name, gets first name
        return firstName;
    }

    /**
     * Setter method for firstName, takes in the following parameter and set it's to firstName
     * @param fn
     */
    public void setFirstName(String fn) {    //Setter for employee first name, sets first name to fn
        firstName = fn;
    }


    /**
     * Getter method for lastName, returns employee lastName
     * @return
     */
    public String getLastName() {    //Getter for employee last name, gets last name
        return lastName;
    }

    /**
     * Setter method for lastName, takes in the following parameter and sets it to lastName
     * @param ln
     */
    public void setLastName(String ln) {     //setter for employee last name, sets last name to ln
        lastName = ln;
    }


    /**
     * Getter method for employeeNumber, returns employeeNumber
     * @return
     */
    public int getEmployeeNumber() {     //Getter for employee #, gets employee #
        return employeeNum;
    }

    /**
     * Setter method for employeeNumber, takes in the following parameters and sets it to employeeNum
     * @param en
     */
    public void setEmployeeNumber(int en) {      //Setter for employee #, sets employee # to en
        employeeNum = en;
    }


    /**
     * Getter method for department, returns department of employee
     * @return
     */
    public String getDepartment() {      //Getter for employee department, gets department
        return department;
    }

    /**
     * Setter method for department, takes in the following parameters and sets it to dept
     * @param dept
     */
    public void setDepartment(String dept) {     //Setter for employee department, sets department to dept
        department = dept;
    }


    /**
     * Getter method for JobTitle, returns job title
     * @return
     */
    public String getJobTitle() {        //Getter for employees job title, gets title
        return jobTitle;
    }

    /**
     * Setter method for jobTitle, takes in the following parameters and sets it to jobTitle
     * @param job
     */
    public void setJobTitle(String job) {        //Setter for employee job title, sets job title to job
        jobTitle = job;
    }

    /**
     * Getter method  for employee type, returns employeeType
     * @return
     */
    public EmployeeType getEmployeeType(){      //getter for employee type, returns type of  employee
        return employeeType;
    }

    /**
     * Setter method for employee type, takes  in the following parameters and sets it to employeeType
     * @param et
     */
    public void setEmployeeType(EmployeeType et){   //setter for employee type, sets employeeType to et
        employeeType = et;
    }

    /**
     *print function for our toString, Override's other methods
     */
    @Override
    public void print() {
        System.out.println(toString());
    }


    /**
     * Function to format currency, takes in the following parameter and returns it in the proper format
     * @param amt
     * @return
     */
    public static String currencyFormat(double amt) {    //method to get our weekly pay/ and pay rate in $0.00 format
        return currency.format(amt);
    }

    /**
     *Function to print employee emergency contacts, uses counter to loop through emergencyContact ArrayList and formats
     *the print for each item in the array
     */

    public void printEmergencyContacts() {       //for loop to loop through all contacts in emergencyContacts ArrayList
        System.out.print("**** Emergency Contacts ****\n");
        for (int i = 0; i < emergencyContacts.size(); i++) {
            System.out.print("\n**** Contact " + (i + 1) + "****\n");
            emergencyContacts.get(i).printContact();    //loops through contacts and prints each one
        }
    }


    /**
     *Function to clear the emergencyContacts ArrayList
     */
    public void clearContacts() {   //clears the array list for emergencyContacts
        emergencyContacts.clear();
    }

    /**
     * Function that adds a contact to emergencyContacts ArrayList, takes in the following parameters and adds it to
     * the ArrayList
     * @param contact
     */
    public void addNewContact(EmergencyContact contact) {   //function to add "contact" to ArrayList emergencyContacts
        emergencyContacts.add(contact);
    }

    /**
     * Getter for emergency contact ArrayList, returns the ArrayList
     * @return
     */
    public ArrayList<EmergencyContact> getEmergencyContactList() {  //"getter" for emergencyContacts ArrayList, returns the list
        return emergencyContacts;
    }

    /**
     * Function to remove contact from emergencyContact ArrayList, takes in the following parameter and uses if statement
     * to check if contact is in ArrayList, if the contact is listed, it is removed
     * @param contact
     * @return
     */
    public boolean removeContact(EmergencyContact contact) {    //checks to see if "contact" is in list, if it is, it removes
        if (emergencyContacts.contains(contact)) {              //contact and returns true, else returns false
            emergencyContacts.remove(contact);
            return true;
        }
        return false;
    }

    /**
     * Function to remove contact via its spot in the ArrayList. Takes in the following parameter and uses if statement
     * to ensure no OutOfBoundsException is thrown
     * @param index
     * @return
     */
    public boolean removeContact(int index) {   //function to remove contact by spot in list
        if (emergencyContacts.size() >= index && index > 0) {
            emergencyContacts.remove(index - 1);
            return true;
        }
        return false;
    }

    /**
     *Function to add abstract method for subclasses
     */
    public abstract void resetWeek();   //adds abstract method

    /**
     * Function to add abstract method for subclasses
     * @return
     */
    public abstract double calculateWeeklyPay();    //adds abstract method

    /**
     *Function to add abstract method for subclasses
     */
    public abstract void annualRaise(); //adds abstract method

    /**
     * Function to add abstract method for subclasses
     * @return
     */
    public abstract double holidayBonus();  //adds abstract method

    /**
     * Function to add abstract method for subclasses
     * @param pay
     */
    public abstract void setPay(double pay);    //adds abstract method

    /**
     * Override method for subclasses, returns all variables for our Employee class, and also returns specific variables
     * for each subclass
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +        //function to print employee info
                "\nID: " + employeeNum +
                "\nDepartment: " + department +
                "\nTitle: " + jobTitle +
                "\nType: " + employeeType.toString();

    }


    /**
     * Function to compare employeeNum with what was previously stored. Takes in the following parameters, changes their
     * type, and then compares it with what was stored. If same, return true, otherwise return false
     * @param obj2
     * @return
     */
    @Override
    public boolean equals(Object obj2) {
        if (obj2 instanceof Employee) {                                 //checks if obj2 is part of class
            Employee e2 = (Employee) obj2;                          //converts obj2 to employee type
            if (e2.getEmployeeNumber() == employeeNum) {        //compares employee # w what was grabbed
                return true;
            } else
                return false;
        }
        return false;
    }

}



