import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=num;
        int count=0;
        int sum=0;
        int rem=0;
        int temp=0;
        while(num!=0){
            count++;
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        while(sum!=0){
          
            rem=sum%10;
            sum=sum/10;
            temp=temp+(int)Math.pow(rem,count);
        }
       if(val==temp){
        System.out.println("Given num is armstrong");
       }
       else{
        System.out.println("Given num is not armstrong");
       }

    }
}
