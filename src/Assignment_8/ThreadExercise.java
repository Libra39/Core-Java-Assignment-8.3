/**
 * 
 */
package Assignment_8;																		// Package declared
import java.util.logging.Level;																// Import java logging package, Java provides logging facility in the java.util.logging package.
import java.util.logging.Logger;															// Import java logging package, Java provides logging facility in the java.util.logging package.

/**
 * Write an application to implement the basic functions for the Online Banking Application (Hint:-Use synchronized). 
 * Show deposit and withdraw functionality for the Online Banking Application (Using synchronized).
 * Also,compare your output without using synchronized. 
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */

public class ThreadExercise extends Thread implements Runnable {							// Class declared, Java Thread By Implementing Runnable Interface
	private Person person;																	// private variable declared 
	public ThreadExercise(Person p) {														// constructed created 
    this.person = p;}

public static void main(String[] args) {										  			// Main method declared 
    ThreadExercise threadExercise1 = new ThreadExercise(new Person("Person 1"));  			// new object threadExercise1 created  
    threadExercise1.start();																// Call start() method to start executing the thread object.
    ThreadExercise threadExercise2 = new ThreadExercise(new Person("Person 2"));			// new object threadExercise2 created
    threadExercise2.start();																// Call start() method to start executing the thread object.
    ThreadExercise threadExercise3 = new ThreadExercise(new Person("Person 3"));			// new object threadExercise3 created
    threadExercise3.start();																// Call start() method to start executing the thread object.
}																							// main method closed

@Override	
public void run() {																			// implementation for run() method	
    for (int i = 0; i < 3; i++) {															// for loop condition of Person 1, Person 2 and Person 3
        try {																				// try block started
            Account acc = Account.getAccount(person);										// new object created 
            acc.withdraw(100);																// withdraw() method called
            try {																			// nested try block
                Thread.sleep(200);															// thread sleep for 100 sec to avoid blockage
            } catch (InterruptedException ex) {												// nested catch statement
              Logger.getLogger(ThreadExercise.class.getName()).log(Level.SEVERE, null, ex);} // Java provides logging facility
            if (acc.getBal() < 0) {															// if loop to check the balance
                System.out.println("Account is overdrawn!");}								// print statement
            acc.deposit(200);																// deposit() method called
        } catch (Exception e) {																// catch statement
            e.printStackTrace();}
    }																						// for loop closed
    System.out.println("\nFinal Account balance is Rs." + Account.getBal()+"\n");			// print statement
}																							// run method closed
}																							// class ThreadExercise closed