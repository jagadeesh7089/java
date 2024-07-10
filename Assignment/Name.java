package Assignment;

import java.util.Arrays;

public class Name {
    public static void main(String[] args) {
        String s="jagadeesh";
        char []ar=new char[s.length()];
       for(int i=0;i<=s.length()-1;i++){
         ar[i]=s.charAt(i);  
       }
       char temp;
        for(int j=0;j<=ar.length-1;j++){
            for(int k=j;k<ar.length-1;k++){
                if(ar[j]>ar[k+1]){
                    temp=ar[j];
                     ar[j]=ar[k+1];
                     ar[k+1]=temp;
                }
            }
        }
       System.out.println(Arrays.toString(ar));
    }
}
