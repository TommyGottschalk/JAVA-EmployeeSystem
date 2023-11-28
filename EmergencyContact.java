// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment 8 - ArrayList Emergency Contacts
// DATE: 10/31-- Turned in 11/02
// RESOURCES: book, MCC tutor
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file holds our EmergencyContact class, and all class specific variables and functions.
 */
package EmployeeBlueprints;

/**
 * Creating our class and declaring our variables.
 */
public class EmergencyContact {     //creating our class and declaring our variables
    String name;

    String relationship;

    String phone;

    /**
     * Constructor for Emergency Contacts. Takes on the following parameters and declares them to our variables
     * @param n
     * @param r
     * @param p
     */
    public EmergencyContact(String n, String r, String p) {     //constructor, declaring variables to what was passed to them
        name = n;

        relationship = r;

        phone = p;

    }

    /**
     * Getter method for EmergencyContact name. Returns emergency contact name
     * @return
     */
    public String getName(){        //getter for emergency contract name, gets their name
        return name;
    }

    /**
     * Setter method for emergency contact name. Takes in the following parameters and sets them to name
     * @param n
     */
    public void setName(String n){  //setter for emergency contact name, sets name to n
        name = n;
    }


    /**
     * Getter method for emergency contact relationship. Returns the relationship of emergency contact
     * @return
     */
    public String getRelationship(){    //getter for emergency contract relationship, gets their relationship to employee
        return relationship;
    }

    /**
     * Setter method for emergency contact relationship. Takes on the following parameters and sets it to relationship
     * @param r
     */
    public void setRelationship(String r){  //setter for emergency contact relationship, sets relationship to r
        relationship = r;
    }


    /**
     * Getter method for emergency contact phone number. Returns the phone number
     * @return
     */
    public String getPhone(){   //getter for emergency contract phone#, gets their #
        return phone;
    }

    /**
     * Setter method for emergency contact phone number. Takes in the following parameters and sets it to phone
     * @param p
     */
    public void setPhone(String p){ //setter for emergency contact phone#, sets phone# to p
        phone = p;
    }


    /**
     * Function to print emergency contact info. Prints all variables for emergency contact
     */
    public void printContact(){
        System.out.print("Name: " + name + "\nRelationship: " + relationship + "\nPhone Number: " + phone + "\n");
    }   //prints emergency contact info

}