/**
 * 
 */
package Assignment_8;																						// Package Declared

/**
 * Write an application to implement the basic functions for the Online Banking Application (Hint:-Use synchronized). 
 * Show deposit and withdraw functionality for the Online Banking Application (Using synchronized).
 * Also,compare your output without using synchronized. 
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */

public class Account {																						// Account class declared 
public static Account account;																				// Variable declared
private static int balance = 1000;																			// Integer variable balance declared and assigned value 100
private static Person person;

private Account() {}																						// default constructor created

public static Account getAccount(Person p) {																// Constructor declared to check the initial Account balance
    if (account == null) {
        account = new Account();    }
    Account.person = p;
    return account;}

public static int getBal() {																				// getter created to get the balance in the account
    return balance;}

public /*synchronized*/ void withdraw(int bal) {																// Parameterized synchronized method withdraw()
    try { if (balance >= bal) {																				// try block started
            System.out.println(person.getName() + " " + " : Trying to Withdraw Money");						// Print statement
            try {																							// nested try block started
                Thread.sleep(100);																			// thread sleep for 100 sec to avoid blockage
            } catch (Exception e) {																			// nested catch statement
                e.printStackTrace();}
            balance = balance - bal;																		// if balance >= bal true then decrease balance 
            System.out.println(person.getName() + " " + " : Completed the Withdrawal");						// Print statement
        } else {																							// else statement
            System.out.println(person.getName() + " " + "doesn't have enough money for Withdrawal ");}		// Print statement
        System.out.println(person.getName() + " " + "Withdraw Rs." + balance);						        // Print statement
    } catch (Exception e) {																					// Catch statement
        e.printStackTrace();}
}																											// withdraw() method closed

public /*synchronized*/ void deposit(int bal) {																	// Parameterized synchronized method withdraw()
    try { if (bal > 0) {																					// try block
            System.out.println(person.getName() + " " + " : Trying  to Deposit Money");					    // Print statement
            try {																							// nested try block started
                Thread.sleep(100);																			// thread sleep for 100 sec to avoid blockage
            } catch (Exception e) {																			// nested catch statement
                e.printStackTrace(); }
            balance = balance + bal;																		// if condition to check bal>0 if true then decrease balance
            System.out.println(person.getName() + " " + " : Complete the Deposit");							// Print statement
        } else {																							// else statement
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");}			// print statement
        System.out.println(person.getName() + " " + "Deposit Rs." + balance);							    // print statement
    } catch (Exception e) {																					// Catch statement
        e.printStackTrace();}
	}																										// deposit() method closed
}																											// class Account closed																								
