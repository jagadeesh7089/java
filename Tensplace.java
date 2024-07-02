import java.util.Scanner;

public class Tensplace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num");
        int num=sc.nextInt();
         int val=(num/10)%10;
        
         System.out.println(val);
    }
}
