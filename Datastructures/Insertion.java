package Datastructures;

import java.util.Arrays;

public class Insertion {
    public static void main(String[]args){
        int ar[]={23,54,3,76,8,22,12,5};
        int j;
        for(int i=1;i<=ar.length-1;i++){
            int temp=ar[i];
            for(j=i;j>0;j--){
                if(temp<ar[j-1]){
                    ar[j]=ar[j-1];
                }
                else{
                    break;
                }
            }
            ar[j]=temp;  
        }
        System.out.println(Arrays.toString(ar));
    }
    
}
