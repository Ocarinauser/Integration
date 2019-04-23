import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Ben Zeitler
// Theme is me learning how to implement code correctly
// This project is to demonstrate how to execute code correctly.

// Java Built-in datatypes
// Byte: is an 8-bit signed two's complement integer. Minimum value of -128 to a maximum value of
// 127. Can be useful for saving memory in large arrays. Used in place of int where their limits
// help clarify your code.
// Short: a 16-bit signed two's complement integer. It has a minimum of -32,768 and a maximum of
// 32,767. Same as byte, use short to save memory in large arrays.
// int: is a 32 bit signed two's complement integer. Minimum of -2^31 and Maximum of 2^31-1. Use
// integer class to use int data type as an unsigned integer.
// Long: 64 bit two's complement integers. The signed long has a minimum of -2^63 and a maximum
// value of 263-1. In Java SE 8 and later, you can use the longdata type to represent an unsigned
// 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when
// you need a range of values wider than those provided by int. this class also contains methods.
// Float: is a single-precision 32 nit IEEE 754 floating point. Specified in the Floated-Point
// Types, Formats, and Values section of the Java Language Specification. Like byte and short, use a
// float if you need to save memory in large arrays of floating point numbers. Should never be used
// for precise values, like currency.
// Double: double precision 64 hit IEEE 754 floating point. For decimal values, this data type is
// generally the default choice. Never be used for precise values.
// Boolean: has only two possible values: true and false. Use this data type for simple true/false
// conditions. This data type represents one bit of information, but its "size" isn't something
// that's precisely defined.
// Char: single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum
// value of '\uffff'

// Variable is a location in memory
// Scope means a variable is only accessible in the method it was declared.

// A constructor is a method that doesn't have a return type, name is always same as class name.

public class Main {
  // this is a header, top line of a method, Identified a header

  // method call is using an object we can call a method from another class, identified method call

  // public is an access modifier

  // void is the return type, means method shouldn't return method names

  // Operator precedence evaluates and resolves several operators in an order.

  // Created a method with arguments and return values
  // got the source from repel.it
  // url: https://repl.it/student/submissions/5391932

  // parameters, variables passed, identified: side1 and side2, needs to be multiplied.
  // used * sign

  // Arguments are the actual values that are passed in when method is invoked. Argument Identified

  /**
   * How to find the total by multiplying two sides.
   * 
   * @param side1 the side that will be multiplied.
   * @param side2 second side that will be multiplied.
   * @return return the value.
   */
  public static double calculateTwoTimes(double side1, double side2) {
    double total;
    total = side1 * side2;
    return total;
  }

  // use - sign
  /**
   * How to find the subtraction value by subtracting two sides.
   * 
   * @param side1 Where the side is going to subtract.
   * @param side2 The second side being subtracted.
   * @return return the subtraction value.
   */
  public static double calculateoneTime(double side1, double side2) {
    double subtraction;
    subtraction = side1 - side2;
    return subtraction;
  }

  /**
   * This is where the program starts.
   * 
   * @param args Where my class starts to work.
   */
  public static void main(String[] args) {

    System.out.println("This is my integration project.");
    System.out.println("I have no theme to make out of this.");

    // Used a Math class
    // The Output would be 343.
    System.out.println(Math.pow(7, 3));

    // Compare two springs with == sign.
    // The == checks if both objects point to the same memory location.
    String s1 = "String1";
    String s2 = "String2";
    if (s1 == s2) {

      System.out.println("String 1 is equal to string 2");
    } else if (s1.equals(s2)) {
      System.out.println("String 1 are still equal to string 2");
    }
    // compareTo with two objects
    System.out.println(s1.compareTo(s2));

    // create if/else statements
    // create ternary constructs
    // use relational operators : >= sign
    // below is if/else constucts and ternary constructs, credit goes to Prof. Vanselow for
    // demonstrating in class.
    int grade = 90;

    char finalLetter = (grade >= 90) ? 'A' : 'B';
    // ? is ternary operator
    // variable x = (expression) ? value if true: value if false
    if (grade >= 90) {
      finalLetter = 'A';
      System.out.println(finalLetter);
    } else if (grade >= 80) {
      finalLetter = 'B';
      System.out.println(finalLetter);
    } else if (grade >= 70) {
      finalLetter = 'C';
      System.out.println(finalLetter);
    } else if (grade >= 60) {
      finalLetter = 'D';
      System.out.println(finalLetter);
    } else {
      finalLetter = 'F';
      System.out.println(finalLetter);
    }

    // Use conditional Operators &&, ||
    // Got the idea/source from the course web site. url:
    // https://sites.google.com/view/prof-v/lms/cop-2006/6-conditions-and-operators
    // used == sign
    // The == works with objects because it is used to compare two operands. Whether they are equal
    // or not.
    int years = 5;
    int days = 1825;
    if ((years == 5) && (days == 1825)) {
      System.out.println("years is 5 AND that's 1825 days");
    }
    if ((years == 5) || (days == 365)) {
      System.out.println("years is 5 or the number of days is 1825");
    }
    // Used switch
    // Used break in a loop
    // break is used when the loop is ended and then it resumes the next statement following the
    // loop
    // Credit to John from Caveofprogramming.com. Udemy; switch section 2 lecture 13
    // url: https://www.udemy.com/java-tutorial/learn/v4/t/lecture/135315

    Scanner input = new Scanner(System.in);
    System.out.println("please enter a command: Type Start or Stop ");
    String text = input.nextLine();

    switch (text) {
      case "start":
        System.out.println("Machine started!");
        break;

      case "stop":
        System.out.println("Machine stopped. ");
        break;

      default:
        System.out.println("Command not recognized");
    }
    input.close();

    // Used continue in a loop
    // continue means that it'll skip to the next iteration of the loop.
    // idea/source came from url: https://www.tutorialspoint.com/java/java_continue_statement.htm
    int[] numbers = {1, 2, 3, 4, 5};

    for (int x : numbers) {
      if (x == 3) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }

    int thisNumber = 2;
    System.out.println(--thisNumber);
    // Output will be 1

    // Rolling a dice six times to get six random numbers,
    // got source from repel it url: https://repl.it/student/submissions/5495098
    // assignment "Random"
    // used random class
    // used ++ sign
    // Used While loops
    // Used for loops
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
    for (int counter = 1; counter <= 6; counter++) {
      number = 1 + randomGen.nextInt(6);
      System.out.println(number);

    }

    // Used do while loops
    // Credit to thenewboston
    // url: https://www.youtube.com/watch?v=nfr52iR0Pyg&feature=youtu.be
    int counter1 = 0;

    do {
      System.out.println(counter1);
      counter1++;
    } while (counter1 <= 17);

    // Used % sign
    // Credit to thenewboston.
    // url: https://www.youtube.com/watch?v=8ZaTSedtf9M&feature=youtu.be

    int women;
    int men;
    int people1;
    women = 11;
    men = 3;
    people1 = women % men;
    System.out.println(people1);
    // Output will be 2

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

    System.out.println(firstName
        + " is going really fast. How fast would he be going if he went twice as fast in mph?");
    System.out.println(calculateTwoTimes(howFast, doubleSpeed));

    System.out.println("This is my integration project.");
    System.out.println("It will be a decision making game type of project.");

    final double valuePi = Math.PI;
    // When a variable is declared with final keyword, its value can’t be modified, so for Pi it's
    // always 3.14
    System.out.println(valuePi);

    String anObject = "I'm going to type this casting";
    System.out.println(anObject);
    // Casting is taking an Object of one particular type and “turning it into” another Object type.

    System.out.println("My roommate said  \"Get more papertowels!\" " + "to " + firstName);
    // Static means belonging to a class not an object

    // PSI 3 starts here

    // Inheritance is the process where a class acquires properties (methods and fields) of another.
    // You can reuse the fields and methods of the existing class without having to write and debug
    // them yourself.

    // declare, create, and initialize an array of integers
    // one-dimensional array
    int[] anArray = {1, 2, 3, 4, 5};
    for (int i = 0; i < anArray.length; i++) {
      System.out.println(anArray[i]);
      // manually find the smallest value in an array
      System.out.println(anArray[0]);
    }

    // Get a sum of values in an array using accumulator
    int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    int[] ta = new int[101];
    for (int t : someArray) {
      sum += t;
    }
    for (int t = 0; t < ta.length; t++) {
      ta[t] = t;
    }
    for (int e : ta) {
      sum += e;
    }
    System.out.println(sum);

    // Declare and use an ArrayList
    ArrayList<Integer> theNumbers = new ArrayList<Integer>();

    theNumbers.add(10);
    theNumbers.add(20);
    theNumbers.add(30);

    System.out.println(theNumbers.get(0));
    // It will return 10

    // Search an array
    List<Integer> array = Arrays.asList(1, 3, 5, 2, 4);
    if (array.contains(4)) {
      System.out.println("We found 4");
    }

    // use multi-dimensional arrays

    int[] values = {4, 7, 17};

    System.out.println(values[2]);

    int[][] grid = {{4, 7, 17}, {3, 6}, {1, 2, 3, 4}};
    System.out.println(grid[1][1]);
    System.out.println(grid[0][1]);
    // Search an array and identify index
    // It will print out 17 at number 7
    // prints out 7 in grid 0

    // Search a two-dim array
    // create and use the enhanced for loop

    int[][] points = new int[1][10];

    int totalPoints = 0;
    for (int team = 0; team < points.length; team++) {
      for (int inning = 0; inning < points[team].length; inning++) {
        points[team][inning] = 2;
      }
    }
    for (int team = 0; team < points.length; team++) {
      for (int inning = 0; inning < points[team].length; inning++) {
        totalPoints += points[team][inning];
        System.out.println("The total number of points is " + totalPoints);
      }
    }

    // Effectively utilize exception handling for user input of an int
    try {
      System.out.println("Enter first number");
      int num1 = input.nextInt();
      System.out.println("Enter second number");
      int num2 = input.nextInt();
      System.out.println("Result = " + num1 / num2);

    } catch (Exception ex) {
      System.out.println("You can't do that");
    }

    // Testing out if the bug works to make sure that we have no other bugs presents
    System.out.println("bug".substring(0));
  }

}
