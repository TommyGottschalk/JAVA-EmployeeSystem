// NAME: Tommy Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Assignment10-Interface, Enum & Javadocs with EmployeeSystem
// DATE: 11/14
// RESOURCES: book, stack overflow. Couldn't figure out what assignment meant when it said to "Build the Javadoc Comments
// in IntelliJ and put them in a folder called "docs" in your project." I did the comments and made the folder named 'docs'
//but I couldn't figure out how to get the comments in the folder(?) not really sure if that's what I was supposed to do either.
/**
 * @author Tommy Gottschalk
 * @version 1.0.0
 * This file stores the interface Printable and formats our variable's currency, and percent.
 */
package EmployeeBlueprints;
import java.text.NumberFormat;

/**
 * Printable interface. Stores our formatting for variables percent and currency.
 */
public interface Printable {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();

    /**
     * to call our @Override method
     */
    public void print();
}
