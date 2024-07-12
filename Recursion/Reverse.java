package Recursion;

public class Reverse {
   static void rever(int num){
      if(num!=0){
        System.out.println(num%10);
        rever(num/10);
     }
   }   
    public static void main (String[]args){
          rever(143);
        
    }
    
}
