/* 

Homework 7
Edgar Griffin
CSCI 1301

Design a class named Cylinder to represent cylinders.  The class contains:

•	Two double data fields named radius and length that specify the radius and length of a cylinder. The default values are 1.0 for radius and length.
•	An int static data field named numberOfObjects. The default value is 0.
•	A no-arg constructor that creates a default cylinder.
•	A constructor that creates a cylinder with the specified radius and length.
•	A method named getArea() that returns the base area of the cylinder.
•	A method named getVolume() that returns the volume of the cylinder.
•	The static getNumberOfObjects method to return the data field numberOfObjects.

Requirements:

1.	Draw the UML diagram for the class.  Implement this class. 

2.	Write a test program that should do the following tasks: 
	•   create the first cylinder object using the no-arg constructor;
	•   create a second cylinder using the constructor with arguments to set radius to 2.5 and length to 12.3;
	•   create a third cylinder using the no-arg constructor;
	•   change the third cylinder’s radius to 5.0 and length to 6.5.
	•   print out the radius and length of the first cylinder;
	•   print out the area of the second cylinder;
	•   print out the volume of the third cylinder.  
	•   print out the value of the numOfObjects data field;

*/

public class TestCylinder {
    public static void main(String[] args){
        Cylinder c1 = new Cylinder(); // creating default cylinder
        Cylinder c2 = new Cylinder(2.5, 12.3); // creating cylinder with parameters
        Cylinder c3 = new Cylinder(); // creating default cylinder
        c3.setRadius(5.0); // setting cylinder c3 radius
        c3.setLength(6.5); // setting cylinder c3 length 

        System.out.printf("Length of first cylinder: %.2f \n", c1.getLength()); // calling getLength to print length value of cylinder c1
        System.out.printf("Radius of first cylinder: %.2f \n", c1.getRadius()); // calling getRadius to print radius value fo cylinder c1
        System.out.printf("Base area of the second cylinder: %.2f \n", c2.getArea()); // calling getArea to print area of cylinder c2
        System.out.printf("Volume of third cylinder: %.3f \n", c3.getVolume()); // calling getVolume to print volume of cylinder c3
        System.out.printf("Number of objects: %d \n", Cylinder.numberOfObjects); // getting number of objects from main file
    }
}