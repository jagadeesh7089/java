package Functions;

import java.util.Arrays;

public class Evenarray {
    static void evar(int arr){
        int ar[]=new int[arr/2];
        int in=0;
        for(int i=2;i<=arr;i=i+2){
            ar[in]=i;
            in+=1;
        }
        System.out.println(Arrays.toString(ar));
    }
   public static void main(String[] args) {
             evar(20);  
    
   }
    
}
