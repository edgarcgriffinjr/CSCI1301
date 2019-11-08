/*

Homework 3
Edgar Griffin
CSCI 1301

Your little sister asks you to help her with her multiplication, and you decide to write a Java program that tests her skills.  
The program will let her input a starting number, such as 5.  It will generate ten multiplication problems ranging from 5x1 to 5x10.  
For each problem she will be prompted to enter the correct answer.  The program should check her answer and should not let her advance 
to the next question until the correct answer is given to the current question.  

After testing ten multiplication problems, your program should ask whether she would like to try another starting number.  
If yes, your program should generate another corresponding ten multiplication problems.  This procedure should repeat until she indicates no.

 */

import java.util.*; // generic package, includes scanner

public class Homework3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // set up scanner
        int b = 1; // condition for while loop

        while (b == 1){ // while loop with condition b = 1
            System.out.print("Enter the time tables you want to do: ");
            int time = input.nextByte(); // input for time tables
            
            int i = 1;
            while (i <= 10) { // while loop for time tables time*i
                int ans = time * i; // calculating answer

                System.out.print("Enter your answer for " + time + " * " + i + " = ");
                int in = input.nextByte(); // taking user input answer

                if (ans == in) { // checking if they are equal
                    System.out.print("Good job. ");
                    i++; // increment i to move to next time tables
                }
                else{
                    System.out.print("That is wrong. Try again. ");
                }
            }
            System.out.print("Enter a 1 to start a new times table, enter a 0 to close program: "); // continuance input
            b = input.nextByte();
        }
    }
}
