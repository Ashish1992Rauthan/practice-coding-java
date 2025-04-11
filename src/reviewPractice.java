import java.util.*;
import java.util.stream.Collectors;

public class reviewPractice {
    public static void main(String args[]){
        Myclass a = new Myclass(5);
        System.out.println(a);
    }

}// java constructor overloading
class Myclass{
    int value;
    Myclass(){
        this.value = 0;
}
    Myclass(int value){
    this.value = value;
    }

    public String toString(){  // override the toString method of object class
        return String.valueOf(value);
    }
}

// java constructor overloading Example 2

class Box{
    double width, height, depth ;
    int boxno;
    Box(double w, double h , double d , int num){
        width =w ;
        height = h;
        depth = d;
        boxno = num;
    }
    Box(){
        width = height = width =0;
    }
    Box(int i){
        this();  // this() is used for calling the default constructor from parameterized constructor
        boxno = i;
    }
    public static void main (String args[]){
        Box box1 = new Box(1);
        System.out.println(box1.width);
        System.out.println(box1.boxno);
    }

        }


// local, instance and static variable
class Practice{
    int a =1;
    static int b =2;
    public void name(){
        String name1 = "Ashish";

    }
    public static void main(String args[]){
        System.out.println(b);
        Practice a = new Practice();
        System.out.println(a.a);
        a.name();

    }
}

class DoWhileExample {
    public static void main(String[] args) {
        int count = 0;

        // Do-while loop to print numbers from 1 to 5
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);
    }
}
// To Access Superclass Methods and Variables with super keyword
class Superclass {
    int x = 10;
    void display() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {
    int x = 20;


    void display() {
        super.display(); // Call superclass method
        System.out.println("Subclass method");
        System.out.println("Superclass variable x: " + super.x); // Access superclass variable
        System.out.println("Subclass variable x: " + x);
    }
}
class Super1{
    public static void main(String args[]){
        Subclass a = new Subclass();
        a.display();
    }
}


// Abstraction

abstract class Animal1{
    String name;
    public Animal1(String name){
        this.name = name;
    }
    public abstract void makeSound1();
}

class Dog1 extends Animal1{
    public Dog1 (String name){
        super(name);
    }

    public void makeSound1() {
        System.out.println("bark");
    }
}
class AbstractionExample{
    public static void main(String args[]){
        Dog1 myDog = new Dog1("Rocky");
        myDog.makeSound1();
    }
}

class HelloWorld22 {
    public static void main(String[] args) {
        A2 a1 = new A2(2,4,5);
        a1.twoSide();
        a1.threeSide();

    }
}
interface Sum2{
    void twoSide();

}
class A2 implements Sum2{
    int a;
    int b;
    int c;
    A2(int a, int b, int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public void twoSide(){
        System.out.println(a+b);
    }
    public void threeSide(){
        System.out.println(a+b+c);
    }
}


// comparator and comparable
class Student1{
    int age;
    String name;

    public Student1(int age , String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age=" +age+ ",name=" +name +"]";
    }
}

class Demo{
    public static void main (String args[]){
        Comparator<Student1>  com = new Comparator<Student1>() {
            public int compare(Student1 o1, Student1 o2) {
                if(o1.age >o2.age){
                    return 1;
                }
                else
                    return -1;
            }
        };
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(23,"Ashish"));
        studs.add(new Student1(33,"Ravi"));
        studs.add(new Student1(26,"anjali"));
        studs.add(new Student1(21,"ram"));

        Collections.sort(studs,com);
        System.out.println(studs);
    }
}


class Student2 implements Comparable<Student2>{
    int age;
    String name;

    public Student2(int age , String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age=" +age+ ",name=" +name +"]";
    }


    public int compareTo(Student2 that) {
        if(this.age >that.age){
            return 1;
        }
        else
            return -1;
    }
}

class Demo1{
    public static void main (String args[]){
//        Comparator<Student2>  com1 = new Comparator<Student2>() {
//
//            public int compare(Student1 o1, Student1 o2) {
//                if(o1.age >o2.age){
//                    return 1;  // swap
//                }
//                else
//                    return -1;  //not swap
//            }
//        };
        List<Student2> studs1 = new ArrayList<>();
        studs1.add(new Student2(23,"Ashish"));
        studs1.add(new Student2(33,"Ravi"));
        studs1.add(new Student2(26,"anjali"));
        studs1.add(new Student2(21,"ram"));

        Collections.sort(studs1);
        System.out.println(studs1);

    }
}


class numerical{
    public static void main(String args[]){
        int z =1;
        for(int i=1 ; i<=5; i++){
            for(int j =1 ; j<=i ; j++){
                System.out.print(z++);
            }
            System.out.println();
        }
    }
}

//find the max product of two distinct elements in an Arrays. i/o -> [1,4,3,6,7,0]
class wcewcew {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        int product = 0;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        product= first*second;


        System.out.println(product);
    }
}
/*
Arrays.sort(nums);

        int n = nums.length;

        // Product of two largest numbers
        int product1 = nums[n - 1] * nums[n - 2];

        // Product of two smallest numbers (in case of negative numbers)
        int product2 = nums[0] * nums[1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }
 */

class occurenceOfCharacter {
    public static void main(String[] args) {
        String str = "Ashish Rauthan";
        String str1 = str.replaceAll("\\s+","");
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = 0 ; i <str1.length(); i++) {
            if (hMap.containsKey(str1.charAt(i))) {
                int count = hMap.get(str1.charAt(i));
                hMap.put(str.charAt(i), ++count);
                //
            } else {
                hMap.put(str1.charAt(i),1);
            }
        }
        System.out.println(hMap);
    }
}

class HelloWorld4 {
    public static void main(String[] args) {
        int count =1;
        for(int i =0; i<=4 ; i++){
            for(int j=0; j<i+1 ;j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
class Example1 {
    public static void main(String[] args) {
        try {
            int age = 01;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class ashi {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful. Java is fun!";
        String[] words = input.replaceAll("[^a-zA-Z0-p ]","").split("\\s+");
        Map<String,Integer> num = new HashMap<>();

        for(String word:words){
            num.put(word,num.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> entry: num.entrySet()){
            if(entry.getValue()>2){
                System.out.println(entry.getKey()+":"+ entry.getValue());
            }
        }
    }
}

class reve{
    public static void main(String[] args) {
        String input ="Ashish";
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);
    }
    }

class revEach {
    public static void main(String[] args) {
        String name = "Ashish Rauthan";
        String reverseName = "";
        String[] splitName = name.split(" ");
        for(String word:splitName){
            String reverse = new StringBuilder(word).reverse().toString();
            reverseName += reverse +" ";
        }
        System.out.println(reverseName);
    }
}

class occ {
    public static void main(String[] args) {
        String name = "Ashish Rauthan";
        String equal = name.toLowerCase();
        Map<Character, Integer> occurance = new HashMap<>();
        for(int i=0; i<equal.length();i++) {
            char ch = equal.charAt(i);
            if (ch != ' ') {
                occurance.put(ch, occurance.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(occurance);
    }
}

class acsac {
    public static void main(String[] args) {
        String sentence = "Ashish sir name is Rauthan";
        String[] splitword = sentence.split("\\s+");
        int largest = 0;
        String wordlargest  = "";
        for(String word : splitword){
            if(word.length() >largest){
                largest = word.length();
                wordlargest = word;
            }
        }
        System.out.println(wordlargest);
    }
}

class secolarg {
    public static void main(String[] args) {
        int[] number = {10, 12, 18, 11, 9, 7, 20,19};
        int firstLarge = 0;
        int secondLarge = 0;
        for(int num : number){
            if(num>firstLarge){
                secondLarge = firstLarge;
                firstLarge = num;
            }
            else if(num > secondLarge && num != firstLarge){
                secondLarge = num;
            }
        }
        System.out.println(secondLarge);
    }
}

class secoLower {
    public static void main(String[] args) {
        int[] number = {10, 12, 18, 11, 9, 7, 20,19};
        int firstLower = Integer.MAX_VALUE;
        int secondLower = Integer.MAX_VALUE;
        for(int num : number){
            if(num<firstLower){
                secondLower = firstLower;
                firstLower = num;
            }
            else if(num < secondLower && num != firstLower){
                secondLower = num;
            }
        }
        System.out.println(secondLower);
    }
}

//write a java program that take a string as input and rearrange it so that all vowels appear on the left side of the string and all other characters(constraint and special character) appear on the right side.
class cgjhj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = scanner.nextLine();
        String smallLetter = name.toLowerCase();
        String vowelWord = "";
        String constarintWord = "";
        String newWord = "";
        for(int i=0; i<smallLetter.length();i++){
            char ch = smallLetter.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vowelWord +=ch;
            }
            else{
                constarintWord +=ch;
            }
            newWord = vowelWord+constarintWord;

        }
        System.out.println(newWord);

    }
}

class wcw {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = mat.length; // Assuming it's a square matrix
        int[][] rotatedMat = new int[n][n];
        // Rotate the matrix 90 degrees counterclockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMat[n - j - 1][i] = mat[i][j];
            }
        }


        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Visualization:
Original Matrix:
    j=0	j=1	j=2
i=0	1	2	3
i=1	4	5	6
i=2	7	8	9
Rotated Matrix (90° Counterclockwise):
    j=0	j=1	j=2
i=0	7	4	1
i=1	8	5	2
i=2	9	6	3

Example Transformations:

For i = 0, j = 0:

Original element: mat[0][0] = 1

New position: rotatedMat[2][0] = 1

For i = 0, j = 1:

Original element: mat[0][1] = 2

New position: rotatedMat[1][0] = 2

For i = 0, j = 2:

Original element: mat[0][2] = 3

New position: rotatedMat[0][0] = 3
 */


class wewe {
    public static int factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5)); // Output: 120
    }
}

class rtun {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}

class Missing{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Adjusted array
        int totalNum = 10; // Total number of elements that should be there
        int missingNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int difference = arr[i + 1] - arr[i];
            if (difference > 1) {
                missingNum = arr[i] + 1; // The missing number is one greater than the current element
                break; // Exit the loop once the missing number is found
            }
        }

        System.out.println("Missing number: " + missingNum);

    }
}

class SortString {
    public static void main(String[] args) {
        String str = "My name is Ashish";

        // Remove spaces for sorting only letters (optional)
        str = str.replaceAll("\\s", "");

        // Convert string to character array
        char[] charArray = str.toCharArray();

        
        // Sort the character array
        Arrays.sort(charArray);

        // Convert back to string
        String sortedString = new String(charArray);

        // Print sorted string
        System.out.println("Sorted String: " + sortedString);
    }
}
//reverse an array
class wecwec {
    public static void main(String[] args) {
        int [] arr = {1,1,3,2,4,3,6,1};
        int[] reverse = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            reverse[i] = arr[(arr.length-i)-1];
        }


        System.out.println(Arrays.toString(reverse));
    }
}
//Given an integer array, find a maximum product of a triplet in the array.
class MaxProductOfTriplet {
    public static int maxProductOfTriplet(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Length of the array
        int n = arr.length;

        // Product of the three largest numbers
        int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];

        // Product of the two smallest numbers and the largest number
        int product2 = arr[0] * arr[1] * arr[n - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        System.out.println(maxProductOfTriplet(arr)); // Output: 168
    }
}
//Maximum consecutive one’s (or zeros) in a binary array
class Mqwcqcain {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int count1 = 0;
        int count0 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1 +=1;
            }
            else count0 +=1;
        }
        if(count1 > count0){
            System.out.println("1 is more");
        }
        else System.out.println(") is more");
    }
}
//Move all zeros to end of array
class Mai111n {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[j] = arr[i];
                j++;
            }

        }
        while (j < arr.length) {
            arr1[j] = 0;
            j++;
        }
        System.out.println("Array after moving zeros: " + Arrays.toString(arr1));
    }
}
/*
StringBuilder nonZeros = new StringBuilder();
        int zeroCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0') {
                nonZeros.append(c);
            } else {
                zeroCount++;
            }
        }

        // Append the zeros to the end
        for (int i = 0; i < zeroCount; i++) {
            nonZeros.append('0');
        }
        System.out.println(nonZeros)
 */

class SeparateAlphabetsNumbers {
    public static void main(String[] args) {
        String input = "abc123xyz456"; // Sample input
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Numbers: " + numbers);
    }
}
//Find the majoity element, which appears more than N/2 times.
class majority {
    public static void main(String[] args) {
        int arr[] = {3,3,4,2,3,3,3,1};;
        int len = arr.length;
        int k = len/2;


        Map<Integer,Integer> occ = new HashMap<>();
        // Use sliding window to calculate the sum of remaining windows
        for (int i = 0; i < len; i++) {

            occ.put(arr[i],occ.getOrDefault(arr[i],0)+1);


        }
        for(Map.Entry<Integer,Integer> num : occ.entrySet()){
            if(num.getValue()>k){
                System.out.println(num.getKey());
            }
        }
    }
}
// Find the most frequent Word in a sentence
class MaxRepeatedString {
    public static void main(String[] args) {
        String input = "apple banana orange orange apple banana orange apple orange";
        String[] arr = input.split(" ");
        int maxRepeat = 0;
        String repeatedName ="";
        Map<String,Integer> occ = new HashMap<>();
        for(String value:arr){
            occ.put(value, occ.getOrDefault(value,0)+1);
        }
        for(Map.Entry<String,Integer> maxi : occ.entrySet()){
            if(maxi.getValue()>maxRepeat){
                maxRepeat = maxi.getValue();
                repeatedName = maxi.getKey();

            }
        }
        System.out.println(repeatedName);
    }
}

// patter
class wcwe {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 4 - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
//Sum of minimum and maximum elements of all subarrays of given size K
class wijo {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400,400};
        int maxSum = 0;
        int k = 2;

        // Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;

        // Use sliding window to calculate the sum of remaining windows
        for (int i = k; i < arr.length; i++) {
            // Slide the window: subtract the element going out and add the new element coming in
            windowSum += arr[i] - arr[i - k];

            // Update maxSum if the current windowSum is greater
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        System.out.println(maxSum);

    }
}
//remove duplicate
class removeD {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3, 3, 7, 5};
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr,j+1)));

    }
}

//Write a program to convert uppercase to lowercase and vice versa.

class upperToLower{
    public static void main(String[] args) {
        String input = "HexAwarE";
        StringBuilder converted = new StringBuilder();
        for(int i =0; i< input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                converted.append(Character.toLowerCase(ch));
            }else if (Character.isLowerCase(ch)){
                converted.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(converted);
    }
    }

// shift all even numbers to the left and odd numbers to the right.
class EvenOdd{
    public static void main(String[] args) {
            int[] arr = {2,5,8,7,1,3,6,4,5,9};
        int evenIndex = 0; // Pointer to track the position for even numbers

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // If the current number is even, swap it with the number at evenIndex
                int temp = arr[i];  //temp = 8
                arr[i] = arr[evenIndex]; //arr[2] 8  = arr[1] 5
                arr[evenIndex] = temp;//5=8;
                evenIndex++; // Move the evenIndex pointer to the right
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    }
//class Employee implements Comparable<Employee> {
//    int id;
//    String name;
//    String department;
//
//    public Employee(int id, String name, String department) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//    }
//
//    @Override
//    public int compareTo(Employee o) {
//        return Integer.compare(this.name.length(),o.name.length());
//    }
//
//
//
//    class mapaca{
//    public static void main(String[] args) {
//        List<Employee> employees = List.of(
//                new Employee(1,"Ashish","HR"),
//                new Employee(2,"Ravi","Admin"),
//                new Employee(3,"Sumit","HR")
//
//                );
//        Employee name1 = Collections.max(employees);
//        System.out.println(name1.id+ ","+ name1.name+ ","+name1.department);
//
//    }
//    }
class practicee {
    public static void main(String args[])
    {
        String s="swiss";
        int count=0;
        char[] k =s.toCharArray();
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (k[i]==k[j]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(k[i]);
                break;
            }
            count=0;
        }
    }
}

class anagram{
    public static void main(String[] args) {

        String[] words = {"cat", "tac", "cta", "eat", "ate", "ece"};
    // Create a HashMap to group anagrams
    Map<String, List<String>> anagramMap = new HashMap<>();

    // Iterate through the words array
        for (String word : words) {
        // Sort characters in the word to generate a key
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);
        // Add word to map (without computeIfAbsent)
        if (!anagramMap.containsKey(sortedWord)) {
            anagramMap.put(sortedWord, new ArrayList<>());
            //anagramMap.put("act", new ArrayList<>());
            //"act" does not exist in anagramMap, so we create a new list:
            //Now, anagramMap looks like:
            //{ "act" -> [] }
            //anagramMap.get("act").add("cat"); -> { "act" -> ["cat"] }
        }
        anagramMap.get(sortedWord).add(word);
    }
    // Convert map values to a list of lists (subarrays of anagrams)
    List<List<String>> anagramGroups = new ArrayList<>(anagramMap.values());
        System.out.println("Anagram subarrays: " + anagramGroups);
}
}
class Anagrams {
    public static void main(String args[]) {
        int numberOfAnagrams = 0;
        String[] stringArray = {"eat", "tea", "tan", "ate", "nat", "bat", "plate", "knot"};
        List<String> stringList = Arrays.asList(stringArray);

        for (int i = 0; i < stringList.size() - 1; i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                String s1 = stringList.get(i);
                String s2 = stringList.get(j);

                // Check if they might be anagrams (same length)
                if (s1.length() != s2.length()) {
                    continue;
                }

                // Check if all characters in s1 exist in s2
                boolean isAnagram = true;
                String s2Copy = s2; // We'll modify this to check character counts

                for (int k = 0; k < s1.length(); k++) {
                    char c = s1.charAt(k);
                    int index = s2Copy.indexOf(c);
                    if (index == -1) {
                        isAnagram = false;
                        break;
                    }
                    // Remove the found character to handle duplicates
                    s2Copy = s2Copy.substring(0, index) + s2Copy.substring(index + 1);
                }

                if (isAnagram) {
                    System.out.println(s1 + " " + s2);
                    numberOfAnagrams += 2;
                }
            }
        }
        System.out.println("Total anagram count: " + numberOfAnagrams);
    }
}

//Maximum of all subarray of size K
class wecwec2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        // Use sliding window to calculate the sum of remaining windows
        for (int i = 0; i <= arr.length-k; i++) {
            int maxSum = 0;

            for(int j=i; j<k+i;j++){
                maxSum +=arr[j];

            }
            System.out.println(maxSum);

        }
    }
}

//Remove duplicates from Sorted Array
class scac {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        Map<Integer, Integer> map = new LinkedHashMap<>(); // Maintains insertion order

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // Store element as key
        }
        int[] uniqueArr = new int[map.size()];
        int index = 0;
        for (int key : map.keySet()) {
            uniqueArr[index++] = key;
        }
        System.out.println(Arrays.toString(uniqueArr));


        int j =0;
        for(int i=1; i <arr.length; i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];

            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr,j+1)));
    }
}
class ReverseNumber {
    public static void main(String[] args) {
        int num = 53967;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Append the digit
            num /= 10;  // Remove the last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
class auscac{
    public static void main(String[] args) {
        String num = "539";
        String reverse = "";
        for(int i=0; i<num.length();i++){
            reverse+=num.charAt((num.length()-i)-1);
            //the char is automatically converted into a String.
            // This happens because Java follows implicit type conversion (also known as type promotion) in string concatenation.
            //Behind the scenes, Java converts each primitive type using String.valueOf().
            //String.valueOf(num);
            //reverse+=String.valueOf(num.charAt((num.length()-i)-1));
        }
        System.out.println(reverse);
    }

}
//Find first non-repeating character of given string -> use map


//Sorting without set and insertion order mentain
class RemoveDuplicatesWithoutSet {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3, 3, 7, 5};
//         int[] unique = Arrays.stream(arr).distinct().toArray();
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array for storing unique elements
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) { // Check if arr[i] already exists in temp
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i]; // Add unique elements to temp array
            }
        }

        // Copy unique elements into a new array
        int[] uniqueArr = Arrays.copyOf(temp, index);
        System.out.println(Arrays.toString(uniqueArr));
    }
}

class MergeArrays {
    public static void main(String[] args) {
        // Define the two integer arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Create a new array to hold the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1 to mergedArray
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from array2 to mergedArray
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}

class findCombineWord {
    public static void main(String args[]) {
        String[] words = {"cat", "dog", "catdog", "bird", "birdcat"};
        List<String> result = new ArrayList<>();
        List<String> wordSet = new ArrayList<>(Arrays.asList(words));

        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                String part1 = word.substring(0, i);
                String part2 = word.substring(i);

                // Check if both parts exist in the set and are not the same as the original word
                if (wordSet.contains(part1) && wordSet.contains(part2)) {
                    result.add(word);
                    break;
                }
            }

        }
        System.out.println(result);
    }
}
//find the common element from two array
class common{
    public static void main(String[] args) {
        int[] arr1 ={2,1,4,6,3};
        int[] arr2 ={1,7,8,3,2};
        List<Integer> common = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    common.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(common);
    }

}
class wcwec {
    public static void main(String[] args) {
        String name = "My   name  is   ram";
        String[] nameArr = name.split("\\s+");
        String newName = "";
        for(String value: nameArr){
            newName = newName+ value +" ";
        }
        System.out.println(newName);

    }
    /*  OR
     String name = "My   name  is   ram";
       String newName = name.replaceAll("\\s+"," ").trim();
        System.out.println(newName);
     */
}
//write a method to change i tto only one space between the words them

class dupli {
    public static void main(String[] args) {
        String name = "automation";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) { // If not already present
                result.append(currentChar);
            }
        }

        System.out.println(result.toString()); // Output: "automin"
    }
    /*

Character	result (so far)	indexOf Result	Action
'a'	""	-1 (not found)	Append → "a"
'u'	"a"	-1	Append → "au"
't'	"au"	-1	Append → "aut"
'o'	"aut"	-1	Append → "auto"
'm'	"auto"	-1	Append → "autom"
'a'	"autom"	0 (found)	Skip (duplicate)
't'	"autom"	2 (found)	Skip (duplicate)
'i'	"autom"	-1	Append → "automi"
'o'	"automi"	3 (found)	Skip (duplicate)
'n'	"automi"	-1	Append → "automin"
Final Output: "automin"

     */
}

//write a java program for given string are anagram or not.
class ara{
    public static void main(String[] args) {
        String name1 = "tomato";
        String name2 = "matoto";

        char[] arr1 = name1.toCharArray();
        char[] arr2 = name2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean value = Arrays.equals(arr1, arr2);
        if(value){
            System.out.println("arragram");
        }
        else{
            System.out.println("false");

        }
    }

    }
    //or

class ara1{
    public static void main(String[] args) {
        String name1 = "tomato";
        String name2 = "matoto";

        // Create an array to store character counts (assuming lowercase letters only)
        int[] charCount = new int[26];

        // Count characters in both strings
        for (int i = 0; i < name1.length(); i++) {
            charCount[name1.charAt(i) - 'a']++; // Increment for str1
            charCount[name2.charAt(i) - 'a']--; // Decrement for str2
        }
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("not anagram");
                return;
            }
        }

        System.out.println("anagram");
    }

}
class CombineString{
    public static void main(String[] args) {

        String input = "32400121200";
        StringBuilder zeros = new StringBuilder();
        StringBuilder nonZeros = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0') {
                zeros.append(c);
            } else {
                nonZeros.append(c);
            }
        }
        zeros.append(nonZeros);
        System.out.println(zeros.toString());


    }
    }

//count each character
class countEach{
    public static void main(String[] args) {
        String str = "aabbcccdd";
        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character and its count
        compressed.append(currentChar).append(count);

        System.out.println(compressed.toString());

    }
    }

class StringLengthMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        str -> str,           // key: the string itself
                        str -> str.length()   // value: the length of the string
                ));

        System.out.println(map);
    }
}
/*
An interface in Java is a blueprint of a class that defines abstract methods (methods without a body).
It allows multiple inheritance and helps in achieving abstraction and loose coupling.

interface Vehicle {
    void start(); // Abstract method

    default void stop() {  // Default method with body
        System.out.println("Vehicle stopping...");

    //if we provide only void stop() then we have to implement stop() in Car class.
    //Over time, new methods can be added to interfaces without forcing all implementing classes to change.
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Car starting...
        car.stop();  // Output: Vehicle stopping...
    }
}


//Resolving Diamond Problem in Multiple Inheritance
interface A {
    default void show() {
        System.out.println("Interface A");
    }
}
interface B {
    default void show() {
        System.out.println("Interface B");
    }
}
class C implements A, B {
    public void show() {
        A.super.show();  // Resolving conflict by choosing A's method
        //Without overriding show(), the compiler would throw an error due to ambiguity.
        //Both A and B have a default method called show().
        //If a class implements both interfaces, there will be a conflict.
        //A.super.show(); tells Java to use the method from interface A.
        //If we wanted B's method, we could replace it with B.super.show();
    }
}


/////////////////////////
interface A {
    default void show() {  // ✅ Default method
        System.out.println("Interface A");
    }
}
interface B {
    default void show() {  // ✅ Default method
        System.out.println("Interface B");
    }
}
class C implements A, B {
    public void show() {  // Resolving conflict
        A.super.show();  // Calls show() from Interface A
        B.super.show()
    }
}
public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

//////////////////
Correct Way Without default (Implement show() in C)
interface A {
    void show();  // Abstract method
}
interface B {
    void show();  // Abstract method
}
class C implements A, B {
    public void show() {  // Must provide implementation
        System.out.println("Class C implementing show()");
    }
}
public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();  // Output: Class C implementing show()
    }
}

///////////////////////////////////////
// Define an interface
interface Animal {
    void makeSound();  // Abstract method (must be implemented)
}

// Dog class implements Animal interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        Animal d = new Dog();  // ✅ Using interface reference
        d.makeSound();  // Calls Dog's makeSound() method
    }
}
🔹 Why Use an Interface Reference(Animal) Instead of Dog myDog = new Dog();?
✅ Polymorphism → Allows flexibility to switch implementations.
✅ Loose Coupling → Code depends on the interface (Animal), not a specific class (Dog).
✅ Easier to Extend → Can replace Dog with another class (Cat, Lion, etc.) without modifying existing code.

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myPet = new Dog();  // ✅ Interface reference
        myPet.makeSound();  // Woof Woof!

        myPet = new Cat();  // ✅ Reassigning to another implementation
        myPet.makeSound();  // Meow Meow!
    }
}
This allows for polymorphism, meaning myPet can refer to any class that implements Animal (like Dog, Cat, etc.).
but i can add Cat myPet1 = new Cat()
But this approach does not solve the main problem of code flexibility and scalability.

Then, every time you need to switch between them, you must modify your code by adding new variables and changing logic.

This is not scalable. If you later add more animals like Lion, Tiger, etc., you will keep creating new variables (Lion myPet2 = new Lion();, Tiger myPet3 = new Tiger();, etc.), making your code difficult to maintain.

///////////////////////////////////////
Static Methods (Since Java 8)
Static methods belong to the interface and cannot be overridden.
interface Animal {
    static void info() {
        System.out.println("Animals have different sounds");
    }
}
Call it using the interface name:
Animal.info();


-----------------------------------------------------------
ABSTRACTION
abstract class Vehicle {
    abstract void start();  // Abstract method (no body)

    void stop() {  // Concrete method (has a body)
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void start() {  // Implementing abstract method
        System.out.println("Car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // ✅ Allowed
        myCar.start();  // Calls implemented method
        myCar.stop();   // Calls inherited method
    }
}
🔹 Key Points:

start() in Vehicle is abstract, so Car must implement it.
stop() in Vehicle has a body, so Car inherits it.

//////////////////////////////////////////////
Example: Abstract Class with Constructor
abstract class Vehicle {
    String type;

    // Constructor in abstract class
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called. Type: " + type);
    }

    abstract void start();  // Abstract method

    void stop() {  // Concrete method
        System.out.println(type + " stopped.");
    }
}

class Car extends Vehicle {
    Car() {
        super("Car");  // Calling abstract class constructor
    }

    void start() {  // Implementing abstract method
        System.out.println("Car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // ✅ Creating subclass object
        myCar.start();
        myCar.stop();
    }
}
OUTPUT->
Vehicle constructor called. Type: Car
Car starts with a key.
Car stopped.


*/
