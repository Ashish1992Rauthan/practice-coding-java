public class pattern {
    public static void main(String arg[]){
        for( int i =0; i<=4 ; i++){
            for( int j =0; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class pattern2 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class pattern3{
    public static void main(String arg[]){
        for( int i =1; i<=4 ; i++){
            for (int j=1; j<=5; j++){
                //for (int j=1; j<=i; j++){

                if(i>=j){
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }

}

class pattern4 {
    public static void main(String args[]) {
        for (int i = 1; i <=4; i++) {
            for (int j = 5; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern5 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

class pattern6 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for(int j=1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern7 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}

class pattern8 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern9 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern10 {
    public static void main(String args[]) {
        int z = 1;
        for (int i =1; i<=5;i++){
            for(int j =1; j<=i; j++){
                System.out.print(z);
                z++;
            }
            System.out.println();

        }
    }

}

class pattern11 {
    public static void main(String args[]) {
        int z = 5;
        for (int i =1; i<=5;i++){
            for(int j =1; j<=i; j++){
                System.out.print(z);
                z++;
            }
            System.out.println();

        }
    }

}

class pattern12 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class rightAngleTriangle{
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}





