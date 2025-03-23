class Student{
    private int rollno;
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

public class encapsulation {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setRollno(2);
        System.out.println(s1.getRollno());
    }
}
