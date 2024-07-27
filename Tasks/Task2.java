package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        /*Rotate of String */
        String s1="Edupoly";
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter the number ::");
        int n=sc.nextInt(); 
        String[]s2=s1.split("");
            String temp;
            for(int i=s2.length-n;i<s2.length-1;i++){
                temp=s2[i];
                s2[i]=s2[i+1];
                s2[i+1]=temp;
                 

            }
            System.out.println(Arrays.toString(s2));
        
       

    }
    
}
