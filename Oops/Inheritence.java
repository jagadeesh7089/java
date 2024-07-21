class Teacher {
    int x;
    int y;
    Teacher(){
        System.out.println("This is Parent class or Base class");
    }

    void abc(){
        System.out.println("this is the parent abc method");
    }
      private void xyz(int a){
        System.out.println("this is Parent xyz method");
    }

 }

 class Student extends Teacher{
    int x;
    int y;
    Student(){
        System.out.println(" This is Child class or Drived class ");
    }
    void abc(){
        System.out.println("this is the child abc method");
          xyz();
      }
        void xyz(int a){
        System.out.println("this is the child xyz method");
     }
 }

public class Inheritence {

    public static void main(String[]args){

        
          Student s1=new Student();
           s1.abc();
         

        

    }
    
}
