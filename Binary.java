import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int x=8;
        int rem=0;
        int sum=0;
        int count=0;

        while(x!=0 && x!=1){
            rem=x%2;
            x=x/2;
           System.out.print(rem);
           
        }
        System.out.println(x);
    }
}
