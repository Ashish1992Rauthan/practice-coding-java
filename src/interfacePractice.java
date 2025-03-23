// class - class -> extends
 //   class - interface -> implements
  //   interface - interface -> extends
    interface A{
        int age=44;
        String area="rishikesh";

        void show();
        void config();

    }
    interface x{
        void run();
    }
    interface y extends x{

    }
    class B implements A,x{
        public void show(){
            System.out.println("in show");
        }
        public void config(){
            System.out.println("in config");
        }
        public void run(){
            System.out.println("running..");
        }

    }

public class interfacePractice {
        public static void main(String args[]){
            A obj ;
            obj = new B();
            obj.show();
            obj.config();

            x obj1 = new B();
            obj1.run();

            System.out.println(A.area);
        }

    }


