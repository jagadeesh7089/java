package Twodimensational;

public class Lgreatest {
    public static void main(String[]args){
        int [][]ar={{10,14,4},{20,5,2},{3,9,11}};
        int i=ar.length-1;
        int max=ar[ar.length-1][0];
        for(int j=1;j<=ar.length-1;j++){
            if(ar[i][j]>max){
                max=ar[i][j];
            }

        }
        System.out.println(max);
    }
}
