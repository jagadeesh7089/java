package Tasks;

import java.util.Arrays;

public class Insta {
    public static void main(String[]args){
        String s1="Edupoly solutions private Limited";
        String []s2=s1.split(" ");
        String rev=" ";
        for(int i=0;i<=s2.length-1;i++){
            rev=s2[i]+" "+rev;
        }
        s1=rev;
        System.out.println(s1);
    }
    
}
