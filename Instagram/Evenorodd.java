package Instagram;

import java.util.Scanner;

public class Evenorodd {
    /*Check the given number is even or odd without using Airthmetic operators */
    static boolean iseven=true;
     static boolean checknum(int n){
        for(int i=1;i<=n;i++){
            iseven=!iseven;
        }
        return iseven;

     }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ::");
        int num=sc.nextInt();
      

        System.out.println(checknum(num)?"Even":"odd");




    }
    
}
