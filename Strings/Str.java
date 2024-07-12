package Strings;

import java.util.Scanner;

public class Str{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String");
       String s=sc.nextLine();
       for(int i=0;i<=s.length()-1;i++){
        System.out.println(s.charAt(i));
       }
    }
    
}
