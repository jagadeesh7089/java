package Strings;

import java.util.Arrays;

public class Practice {
   public static void main(String[] args) {
     String s="jagadeesh";
     byte b[]=s.getBytes();
     String g="";
     char ch;
     for(int i=0;i<=s.length()-1;i++){
        ch=(char)b[i];
        g=g+ch;
        

     }
     System.out.println(g);




     System.out.println(Arrays.toString(b));
      

   }
    
}
