import java.util.*;

//Min and Max in a List in Java
public class list {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(10,2,40,8,39);
        int max = al.get(0);
        int min = al.get(0);
        for(int i=0; i<al.size(); i++){
            int  first = al.get(i);
            if(first>max){
                max = first;
            }
        }
        System.out.println("Max number is:" + max);
        for(int i=0; i<al.size(); i++){
            int  first = al.get(i);
            if(first<min){
                min = first;
            }
        }
        System.out.println("Min number is:" + min);
        }

        }

class splitListToHalf{
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 4, 5, 7, 3, 2,8);
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();
        for (int i = 0; i < al.size();i++){
            int num = al.size()/2;
            if(i<num){
                firstHalf.add(al.get(i));
            }
            else
                secondHalf.add((al.get(i)));
        }
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}

class removeASubListFromAList{
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 4, 5, 7, 3, 2,8);
        List<Integer> newList = new ArrayList<>();
        int fromIndex = 2;
        int endIndex = 4;
        //al.re
        for(int i=0; i<al.size(); i++){
          //  if()
        }
        System.out.println(al);

    }
    }

class removeRepeatedElement{
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,2,3);
        List<Integer> newal = new LinkedList<>();
        for (int i =0; i< al.size(); i++){

            if(newal.contains(al.get(i))){
                continue;
            }
            else
                newal.add(al.get(i));
        }
        System.out.println(newal);
//
//        // create a set and copy all value of list
//        Set<String> set = new LinkedHashSet<>(gfg);
//
//        // create a list and copy all value of set
//        List<String> gfg1 = new ArrayList<>(set);
//
//        // print ArrayList
//        System.out.println("Modified ArrayList : "
//                + gfg1);
//
//        // -----Using HashSet-----
//        System.out.println("\nUsing HashSet:\n");
//
//        // create a set and copy all value of list
//        Set<String> set1 = new HashSet<>(gfg);
//
//        // create a list and copy all value of set
//        List<String> gfg2 = new ArrayList<>(set);
//
//        // print ArrayList
//        System.out.println("Modified ArrayList : "
//                + gfg2);
    }
}

class commonElementInTwoArrayList{
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("e", "e", "k", "r"));
        List<String> newList = new LinkedList<>();
        String firstChar = "A";
        String lastChar = "R";
        list1.add(0,firstChar);
        list1.add(list1.size(),lastChar);
        System.out.println(list1);
    }
}

class stringToACommaSeparated{
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
        String string = String.join(",",list1);
        System.out.println(list1);

    }
}

class getFirstAndLastElements{
    public static void main(String[] args){
        List<Integer> sb = Arrays.asList(10, 30, 20, 14, 2);
        List<Integer> ab = new ArrayList<>();
        for (int i=0; i<sb.size(); i++){
            if(i!=0 && i!=sb.size()-1){
                ab.add(sb.get(i));
            }
        }
        System.out.println(ab);
    }
}

class sortAnArrayListInAscendingOrder {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>(Arrays.asList("Geeks", "For", "ForGeeks"));
        Collections.sort(list1);
        System.out.println(list1);
    }
}