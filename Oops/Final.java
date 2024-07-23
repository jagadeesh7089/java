public class Final {
    public static void main(String[]args){
       final class Parent{
            int x=12;
          final void abc(){
                System.out.println("this is the parent abc method");
            }

        } 

        class Child extends Parent{
            int y=333;
            void abc(){
                System.out.println("this is the child abc method");
            }
        }
       
            Parent p1=new Parent();
            p1.abc();
    }
    
}
