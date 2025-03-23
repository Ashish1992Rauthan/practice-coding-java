import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// create parent and child class, create an object of child class with 2 int parameters, and I add the two values and print the result from parent constructor.
class Zee1{
    Zee1(int a, int b){
        System.out.println("Parent constructor called.");
        System.out.println(a+b);

    }
}
class Yee1 extends Zee1{
    Yee1(int a, int b){
        super(a,b);
        System.out.println("Child constructor called.");

    }
}
public class practice {
    public static void main(String args[]){

        Yee1 child = new Yee1(3,5);
    }
}


class Animal {
    String species = "asccdc";
    // Superclass constructor
    public Animal(String species) {
        this.species = species;
        System.out.println(species);
        System.out.println("Animal constructor called");
    }
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    String breed;
    // Subclass constructor
    public Dog(String species, String breed) {
        // Implicit call to superclass constructor using super
        super(species);
        // Subclass-specific initialization
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    // Subclass-specific method
    void bark() {
        System.out.println("Woof! Woof!");
    }
}
class Main {
    public static void main(String[] args) {
        // Creating an instance of the subclass (Dog)
        Dog myDog = new Dog("Canine", "Golden Retriever");
        // Accessing superclass members
        System.out.println("Species: " + myDog.species);
        // Accessing subclass members
        System.out.println("Breed: " + myDog.breed);
        // Calling methods from both superclass and subclass
        myDog.makeSound(); // Output: Some generic animal sound
        myDog.bark();      // Output: Woof! Woof!
    }
}


class HelloWorld{
    public static void main(String[] args){
//        int[] a ={2,4,1,3};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        employee demo = new employee(32,"ashish");
        System.out.println(demo);

    }
}
class employee{
    int age;
    String name;
    employee(int a , String b){
        age = a;
        name =b;

    }
    public String toString(){  // override the toString method of object class
        return age+" "+name;
    }
}


class HelloWorld1{
    public static void main(String[] args){

        employee1 demo = new employee1();
        System.out.println(demo);
        demo.age = 32;
        demo.name = "ashish";
        System.out.println(demo);

//        System.out.println(demo.details(32,"Ashish"));
            }
}
class employee1{
     int age;
     String name;
    public String toString(){  // override the toString method of object class
        return age+" "+name;
    }


    }
class HelloWorld2{
    public static void main(String[] args){

        employee2 demo = new employee2();
        employee2 demo1 = new employee2();
        employee2 demo2 = new employee2();

        System.out.println(demo);
        demo.setAge(32);
        demo.setName("Ashish");
        demo1.setAge(30);
        demo1.setName("Anjali");
        demo2.setAge(27);
        demo2.setName("Sonali");
        System.out.println(demo);
        List<employee2> listOfEmployee = new LinkedList<>();
        listOfEmployee.add(demo);
        listOfEmployee.add(demo2);
        listOfEmployee.add(demo1);
        System.out.println(listOfEmployee);
       // Collections.sort(listOfEmployee);



        // create list of employee object
    }
}
class employee2 {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }


    public String toString() {  // override the toString method of object class
        return age + " " + name;
    }
}

class HelloWorld8 {
    public static void main(String[] args) {
        int one = 'A'/'A';
        String s1 = "..........";
        for(int i = one ; i<(s1.length()*s1.length()); i++){
            System.out.println(i);
        }
    }
}

// Print 1 to 100 Without Using for/while/do-while Loop in Code || Using Recursive
class HelloWorld5 {
    public static void main(String[] args) {
        HelloWorld5 as = new HelloWorld5();
        as.printNum(1);
    }
    public  void printNum(int num){
        if(num<=10){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }

}

//Compare Two Integer Numbers (Integer Caching)
class HelloWorld6 {
    public static void main(String[] args) {
        //-128 to 127 range
        Integer num1 = 100;
        Integer num2 = 100;

        if (num1 == num2) {
            System.out.println("both are equal");
        } else System.out.println("both are not equal");
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Test23{
    Test23(int a, int b){
        System.out.println("Paarent");
        System.out.println(a+b);
    }
}
class Test13 extends Test23{
    Test13(int a , int b){
        super(a,b);
        System.out.println("child");
    }
}
class HelloWorld23 {
    public static void main(String[] args) {
        Test13 as = new Test13(2,3);
    }
}

class Parent1 {
    // Constructor with no arguments
    Parent1() {
        System.out.println("Parent constructor");
    }
    // Constructor with one argument
    Parent1(int x) {
        System.out.println("Parent constructor with one argument: " + x);
    }
}
class Child extends Parent {

    Child() {
        this(10); //which is a call to another constructor of the same class with an integer argument
    }
    // Constructor with one argument
    Child(int x) {
        //super(x); // Invokes superclass constructor with one argument
        System.out.println("Child constructor with one argument: " + x);
    }
}

 class Example9 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

// Online Java Compiler
//Is it possible to access private members of a superclass using super in a subclass?

class Animal222{
    int a =3;

    void eat(){System.out.println("eating...");}
}
class Dog22 extends Animal222{
    void eat(){
        super.eat();
        System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog22 d=new Dog22();
        d.work();
        d.eat();
    }}
