package Strings;

import java.util.Scanner;

public class Lastocc {
    public static void main(String[] args) {
        String s1="jagadeesh";
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the Character :: ");
        char ch=sc.next().charAt(0);
        for(int i=s1.length()-1;i>=0;i--){
           if(ch== s1.charAt(i)){
            System.out.println(i);
            break;
           }

        }
    }
    
}
