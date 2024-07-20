package Recursion;

public class Even {
     static void even(int n){
        if(n<=20){
           if(n%2==0){
            System.out.println(n);
           }
           even(n+1);
        }
    }
    public static void main(String[] args) {
         even(1);
        // Even ev=new Even();
        // ev. even(1);
       
    }
}
