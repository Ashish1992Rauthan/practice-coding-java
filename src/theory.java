public class theory {
    /*
    A Singleton class is a design pattern in Java that ensures a class has only one instance and provides a
    global point of access to that instance. This is useful when you want to control object creation,
    such as for logging, database connections, or configuration settings.

    Key Features of a Singleton Class
        Only one instance of the class can be created.
        Global Access:
        The instance is accessible globally through a static method.
        Private Constructor:
        The constructor is private to prevent external instantiation.
        Static Instance:
        The instance is stored as a static variable.

     Steps to Create a Singleton Class
        Make the constructor private.
        Create a static variable to hold the single instance of the class.
        Provide a static method to access the instance (e.g., getInstance()).

     Example of a Singleton Class
     public class Singleton {
    // Step 2: Static variable to hold the single instance
    private static Singleton instance;

    // Step 1: Private constructor to prevent external instantiation
    private Singleton() {
        // Initialization code (if needed)
    }

    // Step 3: Static method to provide global access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
Using the Singleton Class
public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Both obj1 and obj2 refer to the same instance
        System.out.println(obj1 == obj2); // Output: true

        // Call a method on the singleton instance
        obj1.showMessage(); // Output: Hello from Singleton!
    }
}
Key Points
Single Instance:

No matter how many times you call getInstance(), the same instance is returned.

Thread Safety:

The above implementation is not thread-safe. If multiple threads access getInstance() simultaneously, multiple instances might be created.

Lazy Initialization:

The instance is created only when getInstance() is called for the first time.

=================================================================================================

1. Comparable Interface
The Comparable interface is used to define the natural ordering of objects. It is implemented by the class whose
objects need to be sorted.

Key Points:
It is part of the java.lang package.

It has a single method: compareTo().

The class implementing Comparable defines how its instances should be compared to each other.

It is used for default sorting (natural order).
Modifies the original class.
Used when we have a single way to compare objects.
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // Compare students based on age (natural order)
        return this.age - other.age;
		//This method compares the current object (this) with another object (other) of the same type (Student).


    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));

        Collections.sort(students); // Sorts using natural order (age)
        System.out.println(students);
    }
}

When we call:

Collections.sort(students);
Java internally calls compareTo like this:
First Call: Comparing Alice (ID=2) and Bob (ID=1)
Here, this.id = 2 (Alice), and other.id = 1 (Bob).
2 - 1 = 1 (positive value) → Alice should come after Bob.

Key Understanding
✅ this always refers to the current object being sorted.
✅ other (or s) refers to another object from the list that is being compared to this.
✅ The sorting algorithm calls compareTo multiple times with different pairs of objects.


2. Comparator Interface
The Comparator interface is used to define custom sorting logic for objects. It is implemented as a separate class or using lambda expressions.

Key Points:
It is part of the java.util package.

It has a single method: compare().

It allows sorting objects based on multiple attributes or in different ways without modifying the original class.

It is used for custom sorting (not natural order).
Does not modify the original class.
Used when we need multiple ways to compare objects.

import java.util.*;

class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}
// Custom Comparator for sorting by Name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);  // Sorting by name in ascending order
    }
}

// Custom Comparator for sorting by ID in descending order
class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.id - s1.id;  // Sorting by ID in descending order
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(3, "Charlie"));

        // Sorting by Name
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by ID (Descending)
        Collections.sort(students, new IdComparator());
        System.out.println("\nSorted by ID (Descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


Key Differences Between Comparable and Comparator
Feature	                   Comparable	               			Comparator
Package						java.lang							java.util
Method						compareTo()							compare()
Sorting Logic			Defines natural order					Defines custom order
Implementation			Implemented by the class itself			Implemented as a separate class
Usage					Single sorting logic					Multiple sorting logics
Modification			Requires modifying the class			No modification to the class needed

When to Use Which?
Use Comparable when you want to define a default (natural) ordering for objects of a class.

Use Comparator when you need to sort objects in different ways or when you cannot modify the class (e.g., for third-party classes).



///////////////////////
Constructor chaining is a technique in Java where one constructor calls another constructor within the same class or in its parent class (superclass). It is used to reuse code and simplify object initialization. Constructor chaining can be achieved in two ways:

Within the same class: Using this().

From a subclass to a superclass: Using super().

1. Constructor Chaining in the Same Class
When one constructor calls another constructor in the same class, it is done using this(). This is useful when you have multiple constructors and want to avoid duplicating code.

public class Student {
    private String name;
    private int age;
    private String course;

    // Constructor 1: Default constructor
    public Student() {
        this("Unknown", 0); // Calls Constructor 2
    }

    // Constructor 2: Parameterized constructor (name and age)
    public Student(String name, int age) {
        this(name, age, "Unassigned"); // Calls Constructor 3
    }

    // Constructor 3: Parameterized constructor (name, age, and course)
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Calls Constructor 1
        Student s2 = new Student("Alice", 22); // Calls Constructor 2
        Student s3 = new Student("Bob", 20, "Computer Science"); // Calls Constructor 3

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
Explanation:
The default constructor (Constructor 1) calls Constructor 2 using this("Unknown", 0).

Constructor 2 calls Constructor 3 using this(name, age, "Unassigned").

This ensures that all fields are initialized properly, even if the user provides only partial information.

2. Constructor Chaining from Subclass to Superclass
When a subclass constructor calls a superclass constructor, it is done using super(). This ensures that the superclass is properly initialized before the subclass.

class Person {
    private String name;
    private int age;

    // Superclass constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private String course;

    // Subclass constructor
    public Student(String name, int age, String course) {
        super(name, age); // Calls superclass constructor
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + ", Course: " + course;
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 22, "Computer Science");
        System.out.println(s);
    }
}
Explanation:
The Student constructor calls the Person constructor using super(name, age).

This ensures that the name and age fields of the Person class are initialized before the Student class adds its own fields.

Key Points About Constructor Chaining
1.this():
Used to call another constructor in the same class.

Must be the first statement in the constructor.

Avoids code duplication by reusing initialization logic.

2.super():

Used to call a superclass constructor.

Must be the first statement in the subclass constructor.

Ensures proper initialization of the superclass before the subclass.

3.Default Constructor:

If no constructor is defined, Java provides a default constructor.

If a parameterized constructor is defined, the default constructor is not automatically provided.

4. Order of Execution:

When an object is created, constructors are called in the order of inheritance (from superclass to subclass).


-------------------------------------------------------------------------------------------------------------------\\
Rules of overloading:
Compiler always uses the presidency of child type argument
In Java method overloading, when multiple overloaded methods exist,
the method with the most specific (child) type is preferred over the more general (parent) type.
This means that if an exact match isn't found, the compiler picks the closest possible match, prioritizing subclasses over parent classes.
class Test {
    void show(Object obj) {  // Parent type (Object)
        System.out.println("Object method");
    }

    void show(String str) {  // Child type (String)
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show("Hello");  // Calls show(String)
        t.show(100);      // Calls show(Object) (autoboxed to Integer, which is a subclass of Object)
    }
}
Explanation:

"Hello" is a String, and String is a subclass of Object, so show(String) is preferred.
100 is an int. Since no show(int) method exists, it gets autoboxed to Integer, which is a subclass of Object. Therefore, show(Object) is called.

Key Takeaways
Rule	            Description
Method Name	        Must be the same
Parameter List	    Must be different (in number, type, or order)
Return Type	        Does not matter for overloading
Static Methods	    Can be overloaded
Varargs (...)	    Can be overloaded but may cause ambiguity
Constructors	    Can be overloaded

-------------------------------------------------------------------------------------
1. Checked Exceptions
Definition: Checked exceptions are exceptions that are checked at compile-time.
The compiler ensures that these exceptions are either:
Caught using a try-catch block, or
Declared in the method signature using the throws keyword.

Purpose: They typically represent scenarios outside the program's control, such as I/O errors, file not found, or network issues, where recovery might be possible.

Examples:
IOException
FileNotFoundException
SQLException

Key Characteristics:
Must be handled explicitly.
Subclasses of Exception (but not RuntimeException).

2. Unchecked Exceptions
Definition: Unchecked exceptions are exceptions that are not checked at compile-time.
They occur during runtime, and the compiler does not enforce handling or declaring them.
Purpose: They typically represent programming errors, such as logic mistakes, invalid arguments, or null pointer access.

Examples:
NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException
IllegalArgumentException

Key Characteristics:
Do not need to be explicitly handled or declared.
Subclasses of RuntimeException.


Key Differences
Feature	                    Checked Exceptions	                        Unchecked Exceptions
Checked at Compile-Time	        Yes	                                        No
Handling Requirement	    Must be handled or declared using throws	Optional (not enforced by the compiler)
Caused By	                External factors (e.g., I/O, network)	    Programming errors (e.g., logic mistakes)
Superclass	                Exception	                                RuntimeException
Recovery	                Often recoverable	                        Often unrecoverable
----------------------------------------------------------------------------------------------------
1. throw
Purpose: The throw keyword is used to explicitly throw an exception from a method or block of code.
Usage: It is followed by an instance of an exception (either checked or unchecked).
Where it can be used: Inside a method or block of code.
Example:
public void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("Age must be 18 or older."); // Explicitly throwing an exception
    }
    System.out.println("You are eligible.");
}
In this example, if the age is less than 18, the throw statement creates and throws an ArithmeticException.

2. throws
Purpose: The throws keyword is used in a method signature to declare that the method might throw one or more exceptions.
It does not throw the exception itself but indicates that the caller of the method must handle or propagate the exception.
Usage: It is followed by the names of the exception classes that the method might throw.
Where it can be used: In the method signature.

Example:
public void readFile(String filePath) throws FileNotFoundException {
    File file = new File(filePath);
    FileInputStream stream = new FileInputStream(file); // May throw FileNotFoundException
}
Here, the throws keyword declares that the readFile method might throw a FileNotFoundException.
The caller of this method must either handle the exception or declare it further using throws.


Key Differences
Feature	                            throw	                                throws
Purpose	                Explicitly throws an exception.	            Declares that a method might throw an exception.
Usage	                Inside a method or block of code.	        In the method signature.
Followed By         	An instance of an exception                 The names of exception classes
                        (e.g., new Exception()).	                (e.g., IOException).
Responsibility	        Throws the exception immediately.	         Indicates potential exceptions to the caller.

====================================================================================
//Array a ={6,8,11,6,7,18}, target =17. write a program to print the index of any two array whose sum =target
class Main {
    public static void main(String[] args) {
        int [] arr1 = {6,8,11,6,7,18};
        int target = 17;
        for(int i=0; i<arr1.length; i++){
            for(int j=i+1; j<arr1.length; j++){
                int sum = arr1[i]+arr1[j];
                if(sum==target){
                    System.out.println("index of two array:"+ i + "and" +j);
                    return;
                }
            }
        }
        System.out.println("Try programiz.pro");
    }
}
OR
import java.util.HashMap;

public class TwoSumAllPairs {
    public static void main(String[] args) {
        int[] a = {6, 8, 11, 6, 7, 18}; // Step 1: Define the array
        int target = 17; // Step 2: Define the target sum

        HashMap<Integer, Integer> map = new HashMap<>(); // Step 3: Create a HashMap to store elements & their indices

        boolean found = false; // Step 4: To check if we find at least one pair

        for (int i = 0; i < a.length; i++) { // Step 5: Loop through the array
            int complement = target - a[i]; // Step 6: Calculate complement (what number do we need?)

            // Step 7: Check if the complement exists in the map (means we already saw that number before)
            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + a[i] + "," + complement + ") at indices (" + i + "," + map.get(complement) + ")");
                found = true;
            }

            // Step 8: Store the current number and its index in the HashMap
            map.put(a[i], i);
        }

        // Step 9: If no pair is found, print a message
        if (!found) {
            System.out.println("No two numbers found with the given sum.");
        }
    }
}
Explanation:
Iteration	CurrentNumber(a[i])	        Complement (target - a[i])	map.containsKey(complement)	    Action Taken
i = 0	        6	                    17 - 6 = 11	                    ❌ No	                    Store 6 in map
i = 1	        8	                    17 - 8 = 9	                    ❌ No	                    Store 8 in map
i = 2	        11	                    17 - 11 = 6	                    ✅ Yes (6 is at index 0)	Print Pair (11,6) at (2,0)
i = 3	        6	                    17 - 6 = 11	                    ✅ Yes (11 is at index 2)	Print Pair (6,11) at (3,2)
i = 4	        7	                    17 - 7 = 10	                    ❌ No	                    Store 7 in map
i = 5	        18	                    17 - 18 = -1	                ❌ No	                    Store 18 in map


Qa->find the largest number that does not have any duplicates in an array in java

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int arr[] = {2,4,3,2,3,7,8};
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> seen = new ArrayList<>();  // Creating an ArrayList
        ArrayList<Integer> unique = new ArrayList<>();

        for(int num: arr){
            if(seen.contains(num)){
                duplicates.add(num);
            }
            else{
                seen.add(num);
            }
        }
        int largestUnique = -1;

        for(int num:arr){
            if(!duplicates.contains(num) && num>largestUnique){
                largestUnique = num;
                unique.add(num);
            }
        }
        System.out.println(largestUnique);
        System.out.println(unique);
    }
}
--------------------------------------------------------------------------
what are the different ways to achieve abstraction?
1. Abstract Classes
2. Interfaces
3. Abstract Methods in Concrete Classes
4. Using Encapsulation
5. Using Anonymous Inner Classes

-----------------------------------------------------------------------------------
HashMap in Java
A HashMap in Java is part of the java.util package and provides a way to store key-value pairs.
It is one of the most commonly used implementations of the Map interface.
Key Characteristics of HashMap
1.Stores Key-Value Pairs: Each key maps to a value.
2.No Duplicate Keys: Keys are unique, but values can be duplicated.
3.Allows One Null Key: Multiple null values are allowed, but only one null key.
4.Unordered: Entries are not stored in any specific order.
5.Not Thread-Safe: HashMap is not synchronized; use ConcurrentHashMap or Collections.synchronizedMap() for thread safety.
6.Uses Hashing: It internally uses a hash table with a hashing mechanism to store elements efficiently.

Basic Operations
1. Creating a HashMap
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements (put method)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println(map);  // Output: {1=Apple, 2=Banana, 3=Cherry}
    }
}
2. Accessing Elements
System.out.println(map.get(1)); // Output: Apple
System.out.println(map.get(4)); // Output: null (Key not found)

3. Checking if a Key or Value Exists
System.out.println(map.containsKey(2));  // Output: true
System.out.println(map.containsValue("Banana")); // Output: true

4. Removing an Entry
map.remove(2);
System.out.println(map);  // Output: {1=Apple, 3=Cherry}

5. Iterating Over a HashMap
// Using forEach and Lambda
map.forEach((key, value) -> System.out.println(key + " -> " + value));

// Using Entry Set
for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
--------------------------------------------------------------------------------------
LinkedHashMap in Java
LinkedHashMap is a subclass of HashMap that maintains insertion order. It is part of the java.util package and
implements the Map interface.

Key Features of LinkedHashMap
1.Maintains Insertion Order: Unlike HashMap, which does not guarantee any order, LinkedHashMap maintains the order in which elements were inserted.
2.Allows One null Key and Multiple null Values: Just like HashMap.
3.Faster Access: Provides O(1) time complexity for put(), get(), and remove() operations.
4.Not Thread-Safe: If thread safety is required, use Collections.synchronizedMap() or ConcurrentHashMap.
5.Extends HashMap: It has all the methods and behaviors of HashMap, with the added feature of maintaining order.

Basic Operations
1. Creating a LinkedHashMap
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map);  // Output: {3=Cherry, 1=Apple, 2=Banana}
    }
}

2. Accessing Elements
System.out.println(map.get(1)); // Output: Apple

3. Removing an Entry
map.remove(2);
System.out.println(map);  // Output: {3=Cherry, 1=Apple}

4. Checking If a Key or Value Exists
System.out.println(map.containsKey(3));  // Output: true
System.out.println(map.containsValue("Banana")); // Output: false (Since we removed it)

5. Iterating Over LinkedHashMap
// Using forEach and Lambda
map.forEach((key, value) -> System.out.println(key + " -> " + value));

// Using Entry Set
for (LinkedHashMap.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

-----------------------------------------------------------------------------------
TreeMap in Java
TreeMap is a part of the java.util package and implements the NavigableMap interface, which extends SortedMap.
It stores key-value pairs in ascending sorted order of keys using a Red-Black Tree (self-balancing BST).

Key Features of TreeMap

1.Sorted Order: Maintains keys in natural sorting order (ascending by default).
2.No Null Keys (since Java 8): Unlike HashMap and LinkedHashMap, TreeMap does not allow null keys. However, it allows multiple null values.
3.Logarithmic Time Complexity (O(log n)): Operations like put(), get(), and remove() take O(log n) due to the tree structure.
4.Thread-Safety: It is not thread-safe. Use Collections.synchronizedSortedMap() for thread safety.
5.Implements NavigableMap: Supports methods like higherKey(), lowerKey(), ceilingKey(), and floorKey().

Basic Operations
1. Creating a TreeMap
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements (automatically sorted by key)
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(5, "Mango");

        System.out.println(map);  // Output: {1=Apple, 2=Banana, 3=Cherry, 5=Mango}
    }
}

2. Accessing Elements
System.out.println(map.get(2));  // Output: Banana
System.out.println(map.get(4));  // Output: null (Key not found)

3. Removing an Entry
map.remove(3);
System.out.println(map);  // Output: {1=Apple, 2=Banana, 5=Mango}

4. Checking If a Key or Value Exists
System.out.println(map.containsKey(5));    // Output: true
System.out.println(map.containsValue("Mango")); // Output: true

5. Iterating Over a TreeMap
// Using forEach and Lambda
map.forEach((key, value) -> System.out.println(key + " -> " + value));

// Using Entry Set
for (TreeMap.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

NavigableMap Methods
TreeMap provides additional methods for working with sorted data:

1. Finding Keys
System.out.println(map.firstKey());  // Output: 1 (Smallest key)
System.out.println(map.lastKey());   // Output: 5 (Largest key)

2. Finding Nearest Keys
System.out.println(map.higherKey(2));  // Output: 3 (Key greater than 2)
System.out.println(map.lowerKey(2));   // Output: 1 (Key less than 2)
System.out.println(map.ceilingKey(2)); // Output: 2 (Key ≥ 2)
System.out.println(map.floorKey(2));   // Output: 2 (Key ≤ 2)


    */
   static class Animal{
        String sound;
        Animal(String voice){
            System.out.println(voice);
        }
        Animal(){
            this("wooo");
            System.out.println("sdcsd");
        }
    }


        public static void main(String[] args) {
            Animal a = new Animal();
        }

}