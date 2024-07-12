package Recursion;

public class Sumodd {
    static int odd(int a,int b){
        if(a>b){
            return 0;
        }
        else{
           return a%2==1?a+odd(a+1,b):odd(a+1,b);
        }
        
    }
   public static void main(String[] args) {
       int res=odd(1,12);
       System.out.println(res);
   } 
}
