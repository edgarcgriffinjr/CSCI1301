/*

Homework 6
Edgar Griffin
CSCI 1301

Write a class that contains the following two methods:

public static double footToMeter (double foot)
public static double meterToFoot (double meter)

The formula for the conversion is:

meter = 0.305*foot
	

In the same class, write a main method that invokes these methods to display the following tables.  Each table should be calculated and displayed using a loop.

*/

public class Homework6 {
    public static void main(String[] args) {
        double foot = 1.0; 
        double meter = 20.0;
        double i;

        System.out.println("Feet       Meters"); // setting up the table headers
        for (i = 1; i <= 10; i++) { // loop to count to 10
            System.out.printf("%-4.1f %11.3f \n", foot, footToMeter(foot) * i); // creating the output and calling the function
        }

        System.out.println();
        System.out.println("Meters     Foot"); // setting up the table headers
        for (i = 1; i <= 10; i++) { // loop to count to 10
            System.out.printf("%-10.1f %-4.3f \n", meter, meterToFoot(meter)); // creating the output and calling funtion
            meter += 5; // increments meter by 5 to match graphic given
        }
    }

    public static double footToMeter(double foot) { // method for converting foot to meter
        double meter = .305 * foot;
        return meter; // returning the answer
    }

    public static double meterToFoot(double meter) { // method for converting meter to foot
        double foot = meter / .305;
        return foot; // return the answer
    }
}