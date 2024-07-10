package Twodimensational;

public class Dia {
    public static void main(String[]args){
        int sum=0;
        int[][]ar={{10,14,4},{20,5,2},{5,9,11}};
        int j=ar.length-1;
        for(int i=0;i<=ar.length-1;i++){
            sum=sum+ar[i][j];
            j=j-1;
        }
        System.out.println(sum);
        // System.out.println(j);
    }

    
}
