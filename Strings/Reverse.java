package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string ::");
        String str=sc.nextLine();
        String rev="";
        for(int i=0;i<=str.length()-1;i++){
            rev=str.charAt(i)+rev;
        }
        str=rev;
        System.out.println(str);
    }
    
}
