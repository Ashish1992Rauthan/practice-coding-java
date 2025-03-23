// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}
class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}
public class abstraction {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}



// Define an interface named Shape
interface Shape1 {
    double calculateArea(); // always public and abstract
}

// Implement the interface in a class named Circle
class Circle1 implements Shape1 {
    private double radius;

    // Constructor for Circle
    public Circle1(double radius) { this.radius = radius; }

    // Implementing the abstract method from the Shape
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}
class Rectangle1 implements Shape1 {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle1(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() { return length * width; }
}

// Main class to test the program
class InterfacePractice {
    public static void main(String[] args)
    {
        // Creating instances of Circle and Rectangle
        Circle1 myCircle = new Circle1(5.0);
        Rectangle1 myRectangle = new Rectangle1(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: "
                + myCircle.calculateArea());
        System.out.println("Area of Rectangle: "
                + myRectangle.calculateArea());
    }
}

abstract class Family{
    abstract void name(String name1);
    Family(){
        System.out.println("Rauthan");
    }
}
class Person extends Family{
    void name(String name1){
                System.out.println(name1);
        }
}

class abstraction1{
    public static void main(String args[]){
        Person a = new Person();
        a.name("Ashish");
    }
}
