import java.util.Arrays;

public class string {

}

class SwapCharacter {
    public static void main(String args[]) {
        String input_string = "Java program";
        System.out.println("The string is defined as: " +input_string);
        int i = 3, j = input_string.length() - 4;
        char[] character = input_string.toCharArray();
        char temp = character[i];
        character[i] = character[j];
        character[j] = temp;

        String result = new String(character);
        System.out.println("\nThe string after swapping is: " +result);
    }
}

class removeLeadingZero{
    public static void main(String args[]) {
        String str = "0000012356900";
        String newStr = "";
        for (int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='0'){
                continue;
            }
            else {
                newStr=newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
    }

class printFirstLetter{
    public static void main(String args[]) {
        String input= "Untined State";
        String FirstLetter = "";
        StringBuilder sb = new StringBuilder("");
        String words[] = input.split(" ");

        for (int i=0; i<=words.length-1;i++){
            FirstLetter = words[i];
            sb.append(FirstLetter.charAt(0));
                   }
        System.out.println(sb);
    }

    }


class evenLengthWord{
    public static void main(String[] args){
        String s = "i am Geeks for Geeks and a Geek";
        String word[] = s.split(" ");
        StringBuilder sb =new StringBuilder("");
        for (int i = 0; i<=word.length-1;i++){
            String words = word[i];
            int length = words.length();
            if(length%2 == 0){
                sb.append(words + " ");
            }
        }
        System.out.println(sb);

    }
}

class reverseString {
    public static void main(String[] args) {
        String name = "Ashish";
        String reverseName = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverseName = reverseName + name.charAt((name.length() - i) - 1);

        }
        System.out.println(reverseName);
    }
}

class palendromeString{
        public static void main(String[] args){
            String name = "nodon";
            String reverseName ="";
            for(int i = 0 ; i<=name.length()-1; i++){
                reverseName = reverseName + name.charAt((name.length()-i)-1);
            }
            if(name.equals(reverseName)){
                System.out.println("Palendrome");
            }
            else{
                System.out.println("not");
            }
        }
}

class countWord{
    public static void main(String[] args){
        String words = "mindfireSolutions noida";
        int count = 0;
        for (int i =0; i<=words.length()-1;i++){

            if(words.charAt(i) != ' '){
                count++;

            }
        }
        System.out.println(count);

    }

    }

class countNumberOfWords{
    public static void main(String[] args){
        String sentence = "my name is ashish rauthan";
        String word[] = sentence.split(" ");
        int count = 0;

        int i =0;
        while (i<word.length){
            count++;
            i++;

        }
        System.out.println(count);
    }
}

class duplicateChar{
    public static void main(String[] args){
        String name = "appleae";
        StringBuilder duplicate = new StringBuilder();
        for(int i=0; i<=name.length(); i++){
            for(int j =i+1 ; j<name.length(); j++){
                if(name.charAt(i) == name.charAt(j)){
                    duplicate.append(name.charAt(j));
                }

            }
        }
        System.out.println(duplicate);

    }

    }
class removeFirstAndLastChar{
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        str = str.substring(1,str.length()-1);
        System.out.println(str);
    }
}

class removecharFromFirstandSecond{
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<= string1.length()-1; i++){
            int flag =0;
            for (int j=0; j<=string2.length()-1;j++){
                if (string1.charAt(i)==string2.charAt(j)){
                    flag =1;
                }
            }
            if(flag !=1){
                sb.append(string1.charAt(i));
            }
        }
        System.out.println(sb);
    }

}

class firstNonRepeatingchar{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        for(int i=0;i<str.length(); i++){
            boolean unique = true;
            for (int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    }

class removeExtraSpace{
    public static void main(String[] args) {
        String s = "I                 am   Ashish   Rauthan";
        String s1 = s.replaceAll("\s+"," ");
        System.out.println(s1);
    }
    }
class replaceZero{
    public static void main(String[] args) {
        String s = "00001234500";
        String zero = "0";
        String replacedzero = "";
        for(int i =0; i< s.length();i++){
            char s1 = s.charAt(i);
            String s1String = String.valueOf(s1);
            if(zero.equals(s1String)){
                continue;
            }
            else{
                replacedzero = replacedzero + s1String;
            }
        }
        System.out.println(replacedzero);
    }

    }


class InsertString {
    public static void main(String[] args) {
        String originalString = "GeeksGeek";
        String stringToBeInert = "For";
        int index = 4;
        StringBuilder sb = new StringBuilder();
        sb.insert(index,stringToBeInert);
        System.out.println(sb.toString());

    }

        }
