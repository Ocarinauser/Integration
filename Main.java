package ZeitlerIntegration;
import java.util.Scanner;


// Ben Zeitler 
// Choose your own adventure 

public class Main {
//this is a header
// public is an access modifier
// void is the return type, means method shouldnt return 
// method names
	
	public static void main (String[] args) {
	

	boolean whenAcurrate = true;	
        int howFast = 0;
	double doubleDecimal = 2.0;
        String firstName = "Ben";
	
	
		
		System.out.println("This is my integration project.");
		System.out.println("It will be a decision making game type of project.");
		
		static final double valuePi = 3.14;
		//When a variable is declared with final keyword, its value can’t be modified, so for Pi it's always 3.14
		
		Object anObject = "I'm going to type this casting";
		String aString = (String)anObject;
		//Casting is taking an Object of one particular type and “turning it into” another Object type. 

		
		System.out.println("My roommate said \"Get more papertowels!\" to firstName.");
		
		double num1 = 5;
		double num2 = 10;
		//this is a call, in the parentheses is an argument
		doubble squared = squareIt(num1, num2, "Hello");

	}

	public static double squareIt(double n1) {
	return n1 * n1;
	
	
}

}
// Variable is a location in memory
// Scope means a variable is only  accessible in the method it was declared.


     
