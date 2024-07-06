package Assignment;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Given number is ::");
        int x=sc.nextInt();
        int num=x;
        int rem=0;
        int sum=0;
        while(num!=0){
            rem=num%10;
            int p=1;
          for(int i=rem;i>=1;i--){
            p=p*i;       
          }
          sum=sum+p;
          num=num/10;
        }
        if(sum==x){
            System.out.println("Given number is Strong number");
        }
        else{
            System.out.println("Given number is Weak Number");
        }   
    }
    
}
