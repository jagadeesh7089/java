import java.util.Scanner;

public class Reversenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        int rem=0;
        while(num!=0){

            rem=num%10;
            num=num/10;
            if(rem>5){
               sum=sum*10+rem;
               System.out.println(sum);
            }
        }
        

    }
}
