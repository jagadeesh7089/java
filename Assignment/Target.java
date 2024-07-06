package Assignment;

import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Given number is ::");
        int X=sc.nextInt();
        int ar[]={20,10,5,15,25,30};
        for(int i=0;i<ar.length-1;i++){
            for(int j=i;j<ar.length-1;j++){
                if(ar[i]+ar[j+1]==X){
                    System.out.println(ar[i]+","+ar[j+1]);
                }
            }
        }
    }
    
}
