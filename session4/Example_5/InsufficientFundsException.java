//  we can extend Exception 
//  to create an Exception called:
//  InsufficientFundsException
import java.io.*;

public class InsufficientFundsException extends Exception {
	// extendemos la classe Exception
	private double amount;
	// Constructor with parameter amount
	public InsufficientFundsException(double amount) {
		this.amount = amount; // Recordar que: The this keyword refers to the current object in a method or constructor.
	}
	//Definimos getAmount
	public double getAmount() {
		return amount;
	}
}
