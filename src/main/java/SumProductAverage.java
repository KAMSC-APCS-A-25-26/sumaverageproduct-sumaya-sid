/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // TODO
        // Read in scanning object
        Scanner scan = new Scanner(System.in);

        // Signature
        System.out.println("Sumaya\nAPCS-A\nLewis 2.2-2.3 Arithmetic Program\n");

        // Assign primitive type and initialize variables
        int numRuns = 0;
        double num1, num2, num3, avg, sum, prod;

        // Prompt user for number of runs
        System.out.print("How many times would you like to run this program?:  ");
        numRuns = scan.nextInt();

        // Read in 3 numbers 3 times
        for (int j=0; j<numRuns; j++)
        {
            // Prompt user
            System.out.print("\nEnter " + numRuns + " numbers: ");

            // Read in numbers
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            num3 = scan.nextDouble();

            // Find the average
            avg = (num1 + num2 + num3) / 3;

            // Find the sum
            sum = (num1 + num2 + num3);

            // Find the product
            prod = num1 * num2 * num3;

            // Output values
            System.out.print("\nAverage: " + avg + "\n");
            System.out.print("Sum: " + sum + "\n");
            System.out.println("Product: " + prod +"\n");
        }
    }
}
