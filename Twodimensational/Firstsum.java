package Twodimensational;

public class Firstsum {
    public static void main(String[]args){
        int [][]ar={{10,14,4},{20,5,2},{3,9,11}};
        int sum=0;
         int i=0;
         for(int j=0;j<=ar.length-1;j++){
            sum=sum+ar[i][j];
         }
         System.out.println(sum);
    }
    
}
