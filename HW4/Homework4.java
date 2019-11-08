/*

Homework 4
Edgar Griffin
CSCI 1301

Write a program that gets 10 int numbers from the user, and calculates and display the sum of the numbers that have been read.  

Requirements: 

Write the program in three versions with three loops. Put all three loops in the main method of your source code. 
•	version1:  use a while loop.
•	version2:  use a do-while loop.
•	version 3:  use a for loop.

*/

import java.util.*; // generic package, includes scanner

public class Homework4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // setup scanner
        int count = 1; // decalare count for while and do-while loops
        int sum = 0; // declare the sum

        System.out.println("This is the while loop.");
        while (count <= 10){
            System.out.print("Enter number " + count + "/10: ");
            int i = input.nextByte(); // input number to add to sum
            sum = sum + i; // adding number to sum
            count++; // incrementing sum
        }
        System.out.println("The sum is " + sum); 
        System.out.println();
        
        count = 1; // rest count
        sum = 0; // reset sum for new loop

        System.out.println("This is the do, while loop.");
        do{
            System.out.print("Enter number " + count + "/10: ");
            int i = input.nextByte(); // input number to add to sum
            sum = sum + i; // adding number to sum
            count++; // incrementing sum
        } while (count <= 10);
        System.out.println("The sum is " + sum);
        System.out.println();

        sum = 0; // reset sum for for loop

        System.out.println("This is the for loop.");
        for(count = 1; count <= 10; count++){
            System.out.print("Enter number " + count + "/10: ");
            int i = input.nextByte(); // input number to add to sum
            sum = sum + i; // add number to sum
        }
        System.out.println("The sum is " + sum);
    }
}