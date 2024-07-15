package Strings;

import java.util.Scanner;

public class Highestf {
    public static void main(String[] args) {
        String s1="   jagadeeeshshankar  ";
        s1=s1.trim();
        System.out.println(s1);
       
        int max=0;
        char ch=' ';
        for(int i=0;i<=s1.length()-1;i++){
              int count=0;
            for(int j=i;j<s1.length()-1;j++){
                if(s1.charAt(i)==s1.charAt(j+1)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ch=s1.charAt(i);
            }
        }
        if(ch!=' '||max>0)
        System.out.println(ch);
    }
    
}
