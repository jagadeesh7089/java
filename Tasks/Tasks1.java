package Tasks;

import java.util.Arrays;

public class Tasks1 {
    public static void main(String[] args) {
        /*Swapping String */
        /* c a t s */
        String s1="cats";
    //    char[] c1=new char[4];
    //     for( int i=0;i<=s1.length()-1;i++){
    //         c1[i]=s1.charAt(i);
    //     }
        //   char []c2=s1.toCharArray();
        
        String[]c1=s1.split("");

        for(int j=0;j<=c1.length-1;j++){
               String temp=c1[j];
            for(int k=j+1;k<c1.length-1;k++){
                temp=c1[j];
                c1[k]=c1[k+1];
                c1[k+1]=temp;
                
               
            }
            System.out.println(Arrays.toString(c1)); 
               
           
           
        }
    

    }
    
}
