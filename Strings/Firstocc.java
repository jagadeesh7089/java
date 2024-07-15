package Strings;

import java.util.Scanner;

public class Firstocc {
    public static void main(String[] args) {
        String s1="jagadeesh";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character :: ");
        char c=sc.next().charAt(0);
        for(int i=0;i<=s1.length()-1;i++){
            if(c==s1.charAt(i)){
                System.out.println(i);
                break;
            }
        }
    }
    
}
