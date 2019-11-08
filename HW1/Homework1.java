/*

Homework 1
Edgar Griffin
CSCI 1301 

Write a program that gets inputs of radius and length of a cylinder, 
and computes and displays its base area and volume using the following formulas:

Requirements:

•	define a constant for PI.
•	declare variables radius, length, area and volume.
•	Use console input to obtain the inputs of radius and length. 
•   Use the console window to display results of the base area and volume.

*/

import java.util.*; // generic package, includes scanner

public class Homework1{
    public static void main(String[] args){
        final double PI = 3.1415; // constant for PI
        Scanner input = new Scanner(System.in); // set scanner object

        System.out.print("Input the value for radius: ");
        double radius = input.nextInt(); // take input for radius through scanner

        System.out.print("Input the value for length: ");
        double length= input.nextInt(); // take input for length through scanner

        double area = radius * radius * PI; // a = (r^2) * pi
        double volume = area * length; // v = a * l

        System.out.printf("The area is %.2f and the length is %.2f.", area, volume); // print results
    }
}