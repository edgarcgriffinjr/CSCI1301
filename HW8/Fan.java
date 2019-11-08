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

public class Fan{
    public static int SLOW = 1; // static variable for fan speeds
    public static int MEDIUM = 2; // static variable for fan speeds
    public static int FAST = 3; // static variable for fan speeds
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    static int numOfOb = 0;
    
    {
        numOfOb += 1; // increments the number of objects everytime a new object is created in test file
    }

    public Fan() { // create default fan with original values
    }

    public Fan(int speed, boolean on, double radius, String color) { // create fan with user values from test file 
        this.speed = speed; // this.x is used to specify that x value to the object created in the test file
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() { // method returns speed to test file
        return speed;
    }

    public void setSpeed(int speed) { // method that sets speed from test file input
        this.speed = speed; // sets speed to object specific speed from test file
    }

    public boolean getOn() { // method returns on to test file
        return on;
    }

    public void setOn(boolean on) { // method that sets on from test file input
        this.on = on; // sets on to object specific speed from test file
    }

    public double getRadius() { // method returns radius to test file
        return radius;
    }

    public void setRadius(double radius) { // method that sets readius from test file input
        this.radius = radius; // sets radius to object specific radius from test file
    }

    public String getColor() { // method returns color to test file
        return color;
    }

    public void setColor(String color) { // method that sets color from test file input
        this.color = color; // sets color to object specific color from test file
    }

    public int getNumOfOb() { // method that returns numOfOb to test file
        return numOfOb;
    }

    public String toS() { // method that returns string desciption
        String description;
        if (on == true) { // conditional statement for if on is true or not
            description = "The speed is " + speed + ", the color is " + color + ", and the radius is " + radius + ".";
            return description;
        } else {
            description = "The color is " + color + ", the radius is " + radius + ", but the fan is off.";
            return description;
        }
    }
}