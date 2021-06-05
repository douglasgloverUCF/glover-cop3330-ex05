/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Scanner;
/*
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to
convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        String input;

        System.out.print("What is the first number? ");
        input = myApp.getInput();
        int first = myApp.getValue(input);

        System.out.print("What is the second number? ");
        input = myApp.getInput();
        int second = myApp.getValue(input);

        myApp.output(first, second);
    }
    String getInput()
    {
        return in.next();
    }
    int getValue(String input)
    {
        return Integer.parseInt(input);
    }
    int add(int first, int second)
    {
        return first + second;
    }
    int subtract(int first, int second)
    {
        return first - second;
    }
    int multiply(int first, int second)
    {
        return first * second;
    }
    int divide(int first, int second)
    {
        return first / second;
    }
    void output(int first, int second)
    {
        System.out.print(first + " + " + second + " = " + add(first, second) + "\n" +
                         first + " - " + second + " = " + subtract(first, second) + "\n" +
                         first + " * " + second + " = " + multiply(first, second) + "\n" +
                         first + " / " + second + " = " + divide(first, second) + "\n");
    }
}
