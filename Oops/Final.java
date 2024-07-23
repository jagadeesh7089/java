public class Final {
    public static void main(String[]args){
         final class Parent {
         int x=212;
         int y=554;
          

        final void  abc(){
            System.out.println("this is the Parent abc");
          }
          void xyz(){
            System.out.println("this is the Parent xyz");
          }
       }

         class Child extends Parent{
          int x=32;
          int y=77;   
          int z=super.y;
          void abc(){
            System.out.println("this is the child abc"); 
            super.xyz();   
        }
        
       }

        Child oc1=new Child();
        System.out.println(oc1.x);

        // int dd=8383;
        // String dd="jagadeesh";
       
        
    }
}