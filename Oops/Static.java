package Oops;

public class Static {
    public static void main(String[]args){

         class Employee{
            static int c=0;
            Employee(){
                this.c++;
            }

        }
        Employee e1=new Employee();
        System.out.println(e1.c);
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        Employee e5=new Employee();
        Employee e6=new Employee();
        Employee e7=new Employee();
        Employee e8=new Employee();
        Employee e9=new Employee();
        System.out.println(e1.c);




    //  class Test {
    //     int x=100;
    //     static int y=200; 
    //     static{
    //          System.out.println("hello edupoly");
    //     }
    //     static void abc(){
    //         System.out.println("Hello abc"); 
    //     }
    //  }
    //    Test ot1=new Test();
    //    Test.abc();
    //    ot1.abc();

      
        
    }
    
}
