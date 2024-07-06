package Assignment;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sum {
    public static void main(String[] args) {
        int num=104;
        int rem=0;
        int x=0;
        for(int i=num;i<=500;i++){
            x=i;
           int sum=0;
        while(x!=0){
                rem=x%10;
                sum=sum+rem;
                x=x/10;
            }
           if(sum==5){
            System.out.println(i);
           }
        }
        
    }
}
