package Twodimensational;

import java.util.Arrays;

public class Test {
    public static void main(String[]args){
        int ar[][]={{21,43,56,45,4},{34,22,65,454,61},{34,54,23},{34,56,87,98},{23,67,55,45,34}};
        for(int i=0;i<=ar.length-1;i++){
            if(ar.length==ar[i].length){
               System.out.println(Arrays.toString(ar[i]));
            }
        }
    }
    
}
