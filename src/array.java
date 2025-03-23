import java.util.*;
// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

public class array {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int numbers[] = new int[size];
        // input
        for(int i=0; i<size;i++ ){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for(int i =0; i< numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index  =" +i);

            }
        }
    }
}

class largestElement1 {
    public static void main (String argd[]){
        int arr[] = {20, 10, 200, 400, 100};
        int largest = 0;
        int lowest =0;
        for (int i = 0 ; i<arr.length; i++){
            int arrLarg = arr[i];
            if (arrLarg>lowest){
                largest = arrLarg;
                lowest = largest;
            }
        }
        System.out.println(largest);

    }
}
// sorting
class sorting {
    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Printing the array after sorting
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr));

    }
}

//Sorting in Descending order
class ArrayInDesc {
    public static void main(String args[]){
        int arr[] = {2, 6, 23, 98, 24, 35, 78};
        Arrays.sort(arr);

        int length = arr.length;
        int newArray[] = new int[length];
        for(int i=0; i<=length-1;i++){
            newArray[i]= arr[(length-1)-i];
        }
        //System.out.print(newArray); can't print directly as it is object
        System.out.print(Arrays.toString(newArray));
    }


}

class removeDuplicate {
    public static void main(String args[]) {
        int arr[] = {2, 4, 7, 2, 3, 4, 4, 7};
        List<Integer> rvdup = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(rvdup.contains(arr[i])){
                continue;
            }
            else {
                rvdup.add(arr[i]);
            }
        }
        System.out.println(rvdup);

            }
        }


// Java Program to Merge Two Arrays
class mergeTwoArr{
    public static void main(String args[]){
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        int arr3[] = new int[arr1.length + arr2.length];
        for(int i =0; i< arr1.length; i++){
            arr3[i]= arr1[i];
        }
        for (int j=0; j< arr2.length; j++){
            arr3[j + arr1.length] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}

//Java Program to Check if two Arrays are Equal or not

class TwoArrEqualOrNot{
    public static void main(String args[]) {
        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {1, 2, 5, 4, 0};
        boolean result = true;

        if(arr1.length == arr2.length){
            for(int i =0; i< arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }
        if(result == true){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld32 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {1, 2, 5, 4, 0};
        boolean result = Arrays.equals(arr1,arr2);
        if(result =true){
            System.out.println("true");
        }
    }
}
//  Remove all occurrences of an element from Array in Java

class remove{
    public static void main(String args[]) {
        int a[] = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int x = 3;
        int index = 0;
        int newElement[] = new int[a.length];
        for(int i = 0 ; i< a.length-1; i++){
            if(a[i]!=x){
                newElement[index]= a[i];
            }
            index ++;
        }
        a[index++]= a[a.length-1];

    }
}

// Java Program to Find Common Elements Between Two Arrays

class commonEle{
    public static void main(String args[]) {
        //StringBuilder sb=new StringBuilder("Hello ");
        String name = "Ashish";
        String reverseName = "";
        int nameLength = name.length();
        for(int i=0; i<nameLength; i++){
            reverseName = reverseName+ name.charAt((nameLength-i)-1);

        }
        System.out.println(reverseName);


    }

}
class commonElementInTwoArrayList1{
    public static void main(String args[]) {
        String list1[] = {"Hii", "Geeks", "for", "Geeks"};
        String list2[] = {"Hii", "Geeks", "Gaurav"};
        List<String> commonElements = new ArrayList<>();
        for (int i=0; i<list1.length; i++){
            String list1Name = list1[i];
            for(int j=0; i<list2.length-1; j++){
                String list2Name = list2[j];
                if(list1Name== list2Name){
                    commonElements.add(list2Name);
                    break;
                }
            }
        }
        System.out.println(commonElements);
    }


    }

class Rotation{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int rotate = 2;
        int[] temp = new int[arr.length];
        int k =0;
        for (int i = rotate; i<arr.length; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i= 0; i<rotate; i++){
            temp[k]= arr[i];
            k++;
        }
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
}

class CommonElement{
    public static void main(String args[]){
        String arr1[] = {"a","b","c","d","e","g"};
        String arr2[] ={"b","d","e","h","g","c"};
        List<String> comEle = new LinkedList<>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    comEle.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(comEle);
    }
}

class removeOccuranceOfElement{
    public static void main(String args[]){
        int arr[] = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        int key = 3;
        List<Integer> arr1 = new LinkedList<>();
        for (int i =0; i<arr.length; i++){
            if(key!=arr[i]){
                arr1.add(arr[i]);
            }
        }
        System.out.println(arr1);
    }

    }

class removeDuplicate1{
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        List<Integer> arr1 = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(arr1.contains(arr[i])){
                continue;
                }
            else{
                arr1.add(arr[i]);
            }

        }
        System.out.println(arr1);
    }
}

class Main7{
    public static void main(String[] args) {

        String input = "i am in an review";
        String[] words = input.split("\\s+"); // Split the input string by whitespace
        boolean foundAn = false;
        int countIAfterAn = 0;

        for (String word : words) {
            if (foundAn) {
                //String str1 = word;
                char ch1 = 'i';
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == ch1) {
                        countIAfterAn++;
                    }
                }
            }
            if (word.equals("an")) {
                foundAn = true;
            }
        }

        System.out.println("Number of 'i' after 'an': " + countIAfterAn);
    }
}
class HelloWorld3 {
    public static void main(String[] args) {
        Comparator<Integer>  com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10> j%10)
                    return 1;

                else return -1;
            }
        };
        List<Integer> num = new ArrayList<Integer>();
        num.add(32);
        num.add(19);
        num.add(20);
        Collections.sort(num,com);
        System.out.println(num);

    }
}

class Singleton {

    private static Singleton singleton = new Singleton( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton() { }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        return singleton;
    }

    /* Other methods protected by singleton-ness */
     void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
class Tester {

    public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );
    }
}


class Animal12 {

    // overridden method
    public  void display(){
        System.out.println("I am an animal");
    }
}

class Dog2 extends Animal12 {

    // overriding method

    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
    }
}

class Main12 {
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2();
        dog1.printMessage();
    }
}