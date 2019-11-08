/* 

Homework 8
Edgar Griffin
CSCI 1301


Design a class named Fan to represent a fan.  The class contains:

•	Three constants named SLOW, MEDIUM, and FAST with values 1, 2, and 3 to denote the fan speed.
•	A private int data field named speed that specifies the speed of the fan (default SLOW).
•	A private boolean data field named on that specifies whether the fan is on (default is false).
•	A private double data field named radius that specifies the radius of the fan (default 5).
•	A string data field named color that specifies the color of the fan (default blue).
•   An int static data field named numberOfObjects (default 0).
•	A no-arg constructor that creates a default fan.
•	A constructor with four parameters (speed, on, radius and color) with the appropriate data types that will be able to a fan object with user desired speed, on-off status, radius and color. 
•	The get(accessor) and set(mutator) methods for all four data fields: speed, on, radius and color.
•	A static getNumberOfObjects() method to return the data field numberOfObjects.
•	A method named toS() that returns a string description for the fan.  If the fan is on, the method returns the fan speed, color, and radius in one combined string.  If the fan is not on, the method returns fan color and radius along with the string “fan is off” in one combined string.

Requirements:

1.	Draw the UML diagram for the Fan class.  Then implement the Fan class. 
2.	When implementing the Fan class, use this keyword to refer the class’s hidden instance variable within set methods and to invoke an overloaded constructor within the constructor with no argument.
3.	Write a test program, the TestFan class, that creates two Fan objects and do the following tasks.  
    a.  Assign maximum speed, radius 10, color yellow, and turn it on for the first fan.  
    b.	Assign medium speed, radius 5, color blue, and turn it on for the second fan.  
    c.	Display the objects by invoking the toS method.
    d.	Turn off the first fan.  Then display the first fan again using the toS method.
    e.	Print out the total number of fan objects that have been created so far. 

Hint: make the constants to be public static, the five data fields private, and the constructors and other methods public.

*/

public class TestFan{
    public static void main(String[] args){
        Fan f1 = new Fan(3, true, 10, "yellow"); // sets up fan 1 with parameters (multiple ways to do it)
        Fan f2 = new Fan(2, true, 5, "blue"); // sets up fan 2 with parameters (multiple ways to do this)


        System.out.println(f1.toS()); // prints string description from toS method for fan 1
        System.out.println(f2.toS()); // prints string description from toS method for fan 2

        f1.setOn(false); // turns fan 1 off
        System.out.println(f1.toS()); // prints string description from toS method for fan 1 after turning off
        System.out.printf("The number of objects is %d.", f2.getNumOfOb()); // returns numOfOb from getNumOfOb method after fan 2
    }
}
