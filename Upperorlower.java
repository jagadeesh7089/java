import java.util.Scanner;

public class Upperorlower {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char");
        char x=sc.next().charAt(0);
        int y=x;
        // if(y>=65&&y<=90){
        //     System.out.println("Given char is Upppercase");
        // }
        // else{
        //     System.out.println("Given char is Lowercase");
        // }
        System.out.println(y);
        System.out.println(x);
    }
}
