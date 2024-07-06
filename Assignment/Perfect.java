package Assignment;

import java.util.Scanner;

public class Perfect {
   public static void main(String[] args) {
    Scanner sc=new Scanner((System.in));
    System.out.print("Given number is ::");
    int x=sc.nextInt();
    int sum=0;
     for(int i=1;i<x;i++){
        if(x%i==0){
            sum=sum+i;
        }
       
    }
    if(x==sum){
        System.out.println("Given num is Perfect num");
    }
    else{
        System.out.println("Given num is not a Perfect num");
    }
   } 
    
}
