import java.util.Scanner;
import java.util.Random;

// Ben Zeitler 
// Theme is Choose your own adventure 
// Java Built-in datatypes
// Byte: is an 8-bit signed two's complement integer. Minimum value of -128 to a maximum value of 127. Can be useful for saving memory in large arrays. Used in place of int where their limits help clarify your code. 
//Short: a 16-bit signed two's complement integer. It has a minimum of -32,768 and a maximum of 32,767. Same as byte, use short to save memory in large arrays.
// int: is a 32 bit signed two's complement integer. Minimum of -2^31 and Maximum of 2^31-1. Use integer class to use int data type as an unsigned integer.
// Long: 64 bit two's complement integers. The signed long has a minimum of -2^63 and a maximum value of 263-1. In Java SE 8 and later, you can use the longdata type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. this class also contains methods.
//Float: is a single-precision 32 nit IEEE 754 floating point. Specified in the Floated-Point Types, Formats, and Values section of the Java Language Specification. Like byte and short, use a float if you need to save memory in large arrays of floating point numbers. Should never be used for precise values, like currency. 
//Double: double precision 64 hit IEEE 754 floating point. For decimal values, this data type is generally the default choice. Never be used for precise values.
//Boolean: has only two possible values: true and false. Use this data type for simple true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
//Char: single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff'


// Variable is a location in memory
// Scope means a variable is only  accessible in the method it was declared.


public class Main {
//this is a header, top line of a method, Identified a header
  
// method call is using an object we can call a method from another class, identified method call

// public is an access modifier
 
// void is the return type, means method shouldn't return method names
  
// Operator precedence evaluates and resolves several operators in an order.
  
 // Created a method with arguments and return values
   // got the source from repel.it   
  //  url:   https://repl.it/student/submissions/5391932
  
  // paramters, variables passed, identified: side1 and side2, needs to be multiplied.
  //used * sign
  
  // Arguments are the actual values that are passed in when method is invoked. Argument Identified
  
  public static double calculateTwoTimes(double side1, double side2) {
    double total;
    total = side1 * side2;
return total; 
  }
  
 
    
    public static void main (String[] args) {
      
      System.out.println("This is my integration project.");
      System.out.println("It will be a decision making game type of project.");
      
      // Used a Math class
      // The Output would be 343.
      system.out.println(Math.pow(7,3));
      
      
      // Compare two springs with == sign.
      //The == works with objects because it is used to compare two operands. Whether they are equal or not.
        String s1 = "String1"; 
        String s2 = "String2"; 
       if (s1 == s2){ 
  
        System.out.println(" String1 and string1 are the same");
       }
      // compareTo with two objects 
      System.out.println(s1.compareTo(s2));
        
        
      
      
      // create if/else statements
      // create ternary constructs
      // use relational operators : >= sign
      // below is if/else constucts and ternary constructs, credit goes to Prof. Vanselow for demonstrating in class.
      int grade = 90;
      
      char finalLetter = (grade >= 90) ? 'A' : 'B';
      //  ? is ternary operator
      // variable x = (expression) ? value if true: value if false
      if (grade >=90) {
        finalLetter = 'A';
      }
      else if (grade >= 80){
        finalLetter = 'B';
      }
      else if (grade >= 70){
        finalLetter = 'C';
      }
      else if (grade >= 60){
        finalLetter = 'D';
      }
      else {
        finalLetter = 'F';
      }
      
      // Use conditional Operators &&, ||
      // Got the idea/source from the course web site.     url:  https://sites.google.com/view/prof-v/lms/cop-2006/6-conditions-and-operators 
      // used == sign  
        int years = 5;
        int days = 1825;
        if((years == 5) && (days == 1825))
            System.out.println("years is 5 AND that's 1825 days");
        if((years == 5) || (days == 365))
            System.out.println("years is 5 or the number of days is 1825");
      
      
      
      // Used Switch
      // Used Break in a loop
      // Break is used when the loop is ended and then it resumes the next statement following the loop
      // Credit to John from Caveofprogramming.com. Udemy; switch  section 2 lecture 13 
      // url:   https://www.udemy.com/java-tutorial/learn/v4/t/lecture/135315
      System.out.println("please enter a command:  ");
      String text = input.nextLine();

      Switch(text) {
      Case "start" :
      System.out.println("Machine started!");
      Break;

      Case "stop":
      system.out.println("Machine stopped. " );
      Break;

      Default:
    System.out.println("Command not recognized");
        
        // Used continue in a loop
        // continue means that it'll skip to the next iteration of the loop.
        // idea/source came from url:  https://www.tutorialspoint.com/java/java_continue_statement.htm
    char [] bigLetters = {A, B, C, D, E};
        
        for (char y : bigLetters ) {
          if ( y == D ) {
            continue;
          }
          System.out.print( y );
          System.out.print("\n");
        }

      int thisNumber = 2;
        System.out.println(--thisNumber);
        // Output will be 1

      
      
      // Rolling a dice six times to get six random numbers, 
      // got source from repel it   url:  https://repl.it/student/submissions/5495098
      // assignment "Random"
      // used random class
      // used ++ sign
      // Used While loops
      // Used for loops
      int num = 0;
      int numberOfTimesRandomNumberPickedAndPrinted = 0;
      
      Random randomGen = new Random();
      
      while (numberOfTimesRandomNumberPickedAndPrinted < 5) {
        System.out.println(randomGen.nextInt(53));
        numberOfTimesRandomNumberPickedAndPrinted++;
      }
      
      for (int numberOfTimes = 0; numberOfTimes < 5; numberOfTimes++) {
        System.out.println(randomGen.nextInt(53));
        numberOfTimesRandomNumberPickedAndPrinted++;
      }
      
      
      int number; 
      for (int counter=1; counter<=6;counter++){
        number = 1+randomGen.nextInt(6);
            System.out.println(1+randomGen.nextInt(6));
      
      }
      
      // Used do while loops
      // Credit to thenewboston.    url: https://www.youtube.com/watch?v=nfr52iR0Pyg&feature=youtu.be
      int counter1 = 0;

       do{ 
    System.out.println(counter1);
    counter1++;
      } while (counter1 <=17);

     
      
      
    
        // Used % sign
        // Credit to thenewboston.
        // url:  https://www.youtube.com/watch?v=8ZaTSedtf9M&feature=youtu.be
      int women, men, people;
      women = 11;
      men = 3
      People = women % men;
      System.out.println(people);
        //Output will be 2
        
        // Used - sign
     if( People = women - men){
      System.out.println(people);
     }
      //Output will be 8
        
       // used / sign
     if (People = women / men){
      System.out.println(people);
     }  
    //output will be 3.666
        
      // Has to be something inside the loop that has to be a condition
   
     // Used +
       System.out.println("15" + 2);
         // Output will be 152
         
  // Used +=        
   double number6 = 6;
number6 += 7;
System.out.println(number6);
 // Output will be 13
       
         
          
        
      
      
    boolean whenAcurrate = true; 
    boolean notAcurrate = false;
        int howFast = 40;
    double doubleSpeed = 2.0;
        String firstName = "Sonic";
        
        System.out.println(whenAcurrate);
        
        System.out.println(notAcurrate);
    
    
        System.out.println( firstName + " is going really fast. How fast would he be going if he went twice as fast in mph?" );
        System.out.println(calculateTwoTimes(howFast, doubleSpeed));
    
        
        System.out.println("This is my integration project.");
        System.out.println("It will be a decision making game type of project.");
        
        final double valuePi = Math.PI;
        //When a variable is declared with final keyword, its value can’t be modified, so for Pi it's always 3.14
        
        Object anObject = "I'm going to type this casting";
        String aString = (String)anObject;
        //Casting is taking an Object of one particular type and “turning it into” another Object type. 

        
        System.out.println("My roommate said  \"Get more papertowels!\" " + "to " + firstName);
        
        }
    }


     
