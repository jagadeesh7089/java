package Strings;

import java.util.Scanner;

public class Searchocc {
    public static void main(String[]args){
        String st="     jagadeesh   ";
        st=st.trim();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character");
        int ch=sc.next().charAt(0);
        for(int i=0;i<=st.length()-1;i++){
            if(ch==st.charAt(i)){
                System.out.println(i);
            }
        }


    }
    
}
