/**
 * 
 */
package Assignment_8;											// Package Declared

/**
 * Write an application to implement the basic functions for the Online Banking Application (Hint:-Use synchronized). 
 * Show deposit and withdraw functionality for the Online Banking Application (Using synchronized).
 * Also,compare your output without using synchronized. 
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */

public class Person {											// Person class declared
	private String name;										// private string variable declared

	public Person(String name) {								// Parameterized constructor created
    this.name = name;}											// This keyword is used to distinguish between class variables and instance variables

	public String getName() {									// getter created 
    return name;}

	public void setName(String name) {							// setter created
    this.name = name;}

	@Override												
	public String toString() {									// method overriding 
    return name;}
}																// Person class closed