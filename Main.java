import java.util.Scanner;
import java.util.Random;

// Ben Zeitler 
// Choose your own adventure 
// Java Built-in datatypes
// Byte: is an 8-bit signed two's complement integer. Minimum value of -128 to a maximum value of 127. Can be useful for saving memory in large arrays. Used in place of int where their limits help clarify your code. 
//Short: a 16-bit signed two's complement integer. It has a minimum of -32,768 and a maximum of 32,767. Same as byte, use short to save memory in large arrays.
// int: is a 32 bit signed two's complement integer. Minimum of -2^31 and Maximum of 2^31-1. Use integer class to use int data type as an unsigned integer.
// Long: 64 bit two's complement integers. The signed long has a minimum of -2^63 and a maximum value of 263-1. In Java SE 8 and later, you can use the longdata type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. this class also contains methods.
//Float: is a single-precision 32 nit IEEE 754 floating point. Specified in the Floated-Point Types, Formats, and Values section of the Java Language Specification. Like byte and short, use a float if you need to save memory in large arrays of floating point numbers. Should never be used for precise values, like currency. 
//Double: double precision 64 hit IEEE 754 floating point. For decimal values, this data type is generally the default choice. Never be used for precise values.
//Boolean: has only two possible values: true and false. Use this data type for simple true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
//Char: single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff'

public class Main {
//this is a header
// public is an access modifier
// void is the return type, means method shouldn't return 
// method names
    
    public static void main (String[] args) {
      
      int grade = 90;
      
      char finalLetter = (grade >= 90) ? 'A' : 'B';
      // ? is ternary operator
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
      
      // Rolling a dice six times to get six random numbers, got source from repel it
      //assignment "Random"
      Random randomGen = new Random();
      int number; 
      for (int counter=1; counter<=6;counter++){
        number = 1+randomGen.nextInt(6);
            System.out.println(1+randomGen.nextInt(6));
      
      }
      
   


         
  
    boolean whenAcurrate = true;    
        int howFast = 25;
    double doubleSpeed = 2.0;
        String firstName = "Ben";
    
        
    
        
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
// Variable is a location in memory
// Scope means a variable is only  accessible in the method it was declared.

     
