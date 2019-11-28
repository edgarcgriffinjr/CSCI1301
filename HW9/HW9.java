/*
Homework 9
Edgar Griffin
CSCI 1301

1.	Write a method that returns an int array using user’s inputs from the console window.  The method should have the following header.  The formal parameter size is the size of the return array.
    	public static int[] inputArray (int size)

2.	Write a method that calculates and returns the average of an array with the following headers.
    	public static double average (int[] list)

3.	Write a method to add two int arrays, assuming that arrays referred by variables a and b are of the same size. The header of the method is as follows.
    	public static int[] add (int[] list1, int[] list2)
    The add method should return an array of the same size as the input arrays, with each element to be the sum of the elements from the input arrays.  
    For example, if the two input arrays are [3, 1, 2, 6, 4, 2] and [1, 2, 3, 4, 5, 6], the returned sum array should be [4, 3, 5, 10, 9, 8].

4.	Write a method to display an int array’s contents on the console window.  The header of the method is as below.
    	public static void displayArray (int[] list)

5.	Write the main method to:
    a.	Create two input arrays with the same size by invoking the inputArray method twice in the main method.
    b.	Calculate the average of the first int array by invoking the average method.  Display the average result on the console window.
    c.	Calculate the array sum of both input arrays by invoking the add method.
    d.	Display the sum array by invoking the displayArray method.

*/

import java.util.*;

public class HW9 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] list1 = inputArray(5);
        int[] list2 = inputArray(5);

        System.out.println(avg(list1));
        int[] newlist = add(list1, list2);
        displayArray(newlist);
    }

    public static int[] inputArray(int size) {
        int[] list = new int[size];
        System.out.print("Enter " + size + " numbers for the array: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static double avg(int[] list) {
        double avg = 0;
        for (int i = 0; i < list.length; i++) {
            avg = list[i] + avg;
        }
        avg = avg / list.length;
        return avg;
    }

    public static int[] add(int[] list1, int[] list2) {
        int[] newlist = new int[list1.length];
        for (int i = 0; i < newlist.length; i++) {
            newlist[i] = list1[i] + list2[i];
        }
        return newlist;
    }

    public static void displayArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}