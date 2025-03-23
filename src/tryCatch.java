public class tryCatch {
    public static void main(String args[]){
        //now the second variable is initialized with 0 value
        int num1 =10, num2 = 10;
        try
        {
            int div = num1/num2;
            // if exception occurs in the above statement then this
            // statement will not execute else it will execute
            System.out.println("num1/num2: "+div);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Catch block: ArithmeticException caught");
        }
        finally{
            System.out.println("Finally block: I will always execute");
        }
        // rest of the code
        System.out.println("Outside try-catch-finally");
    }
}

class teyCatch{
    public static void main(String arg[]){
        try {
            int[] num = new int[10];
            num[10] = 30/0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always print");
        }
    }
}

//program to print the exception information using printStackTrace() method


class Example {
    public static void main(String[] args) {
        try {
            // Some code that may throw an exception
            int result = divideByZero();
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());

        }
    }

    private static int divideByZero() {
        // Attempt to divide by zero to generate an exception
        return 5 / 0;
    }
}





