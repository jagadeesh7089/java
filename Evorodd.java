import java.util.Scanner;

public class Evorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       if(!(x%2==0)){
         System.out .println("Given num is odd");
       }
       else{
        System.out.println("Given num is even");
       }
    }
}
