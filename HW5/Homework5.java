/*

Homework 5
Edgar Griffin 
CSCI 1301

Get an integer n from an input dialog or the console window, print out the following pattern on the console window (you may refer to displaying number-pyramid example shown in class). 

For example, when n is 3, there are 5 rows in total. 

     	    *
           ***
          *****
	       ***
	        *

When n is 4, there are 7 rows in total.

	        *
	       ***
          *****
         *******
          *****
           *** 
	        *

*/

import java.util.*; // generic package, includes scanner

/*
I have no comments for this one, it was hard at the time
I lied, I understand now
*/

public class Homework5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // setup scanner
        System.out.print("Input a value for n: ");
        int n = input.nextInt(); // input integer n
        int i, j;
        int space = n - 1;
        for(j = 1; j <= n; j++){
            for (i = 1; i <= space; i++){
                System.out.print(" "); 
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (j = 1; j <= n - 1; j++){
            for (i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n- j) - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}