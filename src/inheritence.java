class Bicycle {
    int gear;
    int speed;
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void details(){
        System.out.println("No of gears are"+ gear + "\n" +"speed of bicycle"+ speed);
    }
    }
class MountainBike extends  Bicycle{
    int seatheight;
    public MountainBike(int gear, int speed, int seatheight){
        super(gear,speed); //There is no default constructor available in 'Bicycle'.
        this.seatheight =seatheight;
    }
    public void details(){ // run time polymorphism in java i.e overriding

        System.out.println("No of gears are"+ gear + "\n" +"speed of bicycle"+ speed+ "\n" +"height of bike" + seatheight);

    }
}
public class inheritence {
    public static void main(String args[]){
        MountainBike mt = new MountainBike(5,40,20);
        mt.details();

        }
}



// Java Program for Method Overriding i.e run time polymorphism

class Parent {
     void Print()
    {
        System.out.println("parent class");
    }
}
class subclass1 extends Parent {

    public void Print() {
        super.Print(); //calls the parent class's Print() method.
        System.out.println("subclass1"); }
}
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        subclass1 a = new subclass1();
        a.Print();
        }
}

// java program for method overloading i.e compile time polymorphism

class SuperClass{
    void adding(int a , int b){
        System.out.println("Parent class : " + (a+b));
    }
}
class SubClass extends SuperClass {
    void adding(int a, int b, int c) {
        System.out.println("Parent class :" + (a + b + c));
    }

}


class GFG1 {
        public static void main(String[] args) {
            SubClass sb = new SubClass();
            sb.adding(3, 5, 6);
            sb.adding(4, 6);
        }
    }

class Calculator {
    String sum;
    Calculator(String sum){
        this.sum = sum;
        System.out.println(sum);
    }
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Psrent clsdd" + (a + b)); // Calls the first add method
    }

}
class Sum1 extends Calculator {

    Sum1(String name, String assign){
        super(name);

    }
    public void add(int a, int b) {
        super.add(a,b);
        System.out.println("child" + (a + b)); // Calls the first add method
    }

}

class sdcsdv{
    public static void main(String[] args) {

        Sum1 calc = new Sum1("ascacs","cascasc");
       calc.add(1,2);
    }
}
// Using this() to invoke the current class constructor

class Test{
    int a;
    int b;
    int c;

    Test(){
        a=10;
        b= 20;
        System.out.println(a+b);
    }
    Test(int p){
        this(); // compiler get understand that it is current class constructor, then compiler will look for this matching constructor inside current class i.e and invoke the line 82 so basically the job of this keyword is to give a call to the matching constructor line 82.
        c=p;
        System.out.println(c);
    }

}
class This{
    public static void main(String args[]){
        Test t2 = new Test(30);
    }
}


// Java code for using 'this' keyword to return the current class instance
class Test2 {
    int a;
    int b;
    Test2() {
        a = 10;
        b = 20;
    }
   Test2 get() { // return type is class type
        return this;
    }
    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

static class ReturnThis {
     public static void main(String[] args) {
            Test2 object = new Test2();
            object.get().display();
        }
    }
}
class home{
    public void c( work work){
        work.A();

    }
    public void c(office office1){
        office1.A();
    }
}
class work{
    public static void A(){
        System.out.println("Anjali");

    }
}
class office extends work{
     public static void A(){
        System.out.println("Ashish");

    }
}
class HelloWorld222 {
    public static void main(String[] args) {
        office a = new office();  // object cretion at run time, compile time mai reference create hota hai.
        a.A();
//        office a1 = new work();
//        a1.A();
        work b = new work();
        b.A();
        work b1 = new office();
        b1.A();
        home h1 = new home();
        h1.c(b);
        h1.c(a);
        h1.c(b1);
    }
}

class MethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}

//inheritance

class Animal11 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (SubClass) that inherits from Animal
class Dog11 extends Animal11 {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class test232 {
    public static void main(String[] args) {
        Dog11 myDog = new Dog11(); // Creating an object of the Dog class
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method from Dog class
    }
}

// multilevel
// Base class (Grandparent)
class Animal2 {
    void sleep() {
        System.out.println("Animals sleep.");
    }
}

// Intermediate class (Parent)
class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammals walk on legs.");
    }
}

// Derived class (Child)
class Human extends Mammal {
    void talk() {
        System.out.println("Humans can talk.");
    }
}

// Main class
class acwece {
    public static void main(String[] args) {
        Human person = new Human();

        person.sleep(); // Inherited from Animal
        person.walk();  // Inherited from Mammal
        person.talk();  // Defined in Human
    }
}

//Hierarchical inheritance
// Parent class
class Animal3 {
    void sleep() {
        System.out.println("Animals sleep.");
    }
}

// Child class 1
class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
class cwec {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
        myDog.sleep(); // Inherited from Animal
        myDog.bark();  // Defined in Dog

        System.out.println(); // Just for better output spacing

        Cat3 myCat = new Cat3();
        myCat.sleep(); // Inherited from Animal
        myCat.meow();  // Defined in Cat
    }
}


class dcc{
    public void company(){
        System.out.println("Not in any company");

    }
    public void company(String name){
        System.out.println("company: "+ name);
    }
}
class acdccce1{
    public static void main(String[] args){
        dcc a = new dcc();
        a.company();
        a.company("mindireSolution");
    }
}
