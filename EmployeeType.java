// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment10-Interface, Enum & Javadocs with EmployeeSystem
// DATE: 11/14
// RESOURCES: book, stack overflow. Couldn't figure out how to get JavaDoc comments in folder.
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file stores the enum for EmployeeType
 */
package EmployeeBlueprints;

/**
 * Enumeration for employeeType. Defines our constants
 */
public enum EmployeeType {
        HOURLY,
        SALARY,
        COMMISSION;


    /**
     *toString to determine which subclass an employee falls under, if statement to check this.ordinal, then returns the
     * proper class label
     * @return
     */

    public String toString() {
        if (this.ordinal() == 0) {
            return "Hourly";
        } else if (this.ordinal() == 1) {
            return "Salary";
        } else {
            return "Commission";
        }
    }
}
