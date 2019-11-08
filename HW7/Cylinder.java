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

public class Cylinder{

    private final double PI = 3.14159265; // setting PI
    private double radius;
    private double length;
    static int numberOfObjects = 0; 

    {
        numberOfObjects +=1; // increments the number of objects everytime a new object is created in test file
    }

    public Cylinder(){ // creates default cylinder with specified values
        this.radius = 1.0; // this.x is used to specify that x value to the object created in the test file
        this.length = 1.0;
    }
    public Cylinder(double radius, double length) { // creates cylinder with user values from test file
        this.radius = radius; // sets radius to object specific radius from test file
        this.length = length; // sets length to object specific length from test file
        
    }
    public double getRadius() { // method returns radius to test file
        return radius;
    }

    public void setRadius(double radius) { // method that sets radius from test file input
        this.radius = radius; // sets radius to object specific radius from test file
    }

    public double getLength() { // method returns length to test file
        return length; 
    }
    
    public void setLength(double length) {  // method that sets length from the test file input
        this.length = length; // sets length to object specific length from test file
    }
    public double getArea() { // method that returns area = (r^2) * PI
        return PI * radius * radius;
    }
    public double getVolume() { // method that returns volume = (r^2) * l * PI
        return PI * radius * radius * length;
    }
            
}
