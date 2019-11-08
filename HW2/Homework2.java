/*

Homework 2
Edgar Griffin
CSCI 1301

An unnamed student uses the following scheme to determine whether to speed up on a particular assignment:

•	If there are less than 5 days remaining until the assignment is due, or
•	if the student has more than 4 assignments due in all classes, or
•	if it is raining and the temperature is below 50 degrees.

Please use console window input and output (the Scanner class and System.out.println method). Use the following variables to store the user’s console inputs:

•	days: an int indicating the number of days until the assignment is due;
•	assignments: an int indicating the number of assignments the student has for all classes;
•	temperature: a double indicating the temperature;
•	isRaining: a boolean indicating whether it is raining (input true or false).

Set a boolean variable doHomework to true if the student should speed up on the assignment and false otherwise.  Display the results.

 */

import  java.util.*; // generic package, includes scanner

public class Homework2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); // set scnaner object

        System.out.print("Enter the number of days until the assignment is due: ");
        int days = input.nextByte(); // take input for days

        System.out.print("How many assignments due for all classes: ");
        int ass = input.nextByte(); // take input for ass(ignment) :)

        System.out.print("Enter the temperature: ");
        double temp = input.nextByte(); // take input for temperature

        System.out.print("Is it raining (true or false): ");
        boolean isRaining = input.nextBoolean(); // take boolean input for raining

        if (days < 5 || ass > 4 || (isRaining  && temp < 50)){ // condition statement '||' means OR
            System.out.print("You NEED to speed up!");
        }
        else { // if the conditinal statement from if is not satisfied, program goes here
            System.out.print("You can relax a bit.");
        }
    }
}
