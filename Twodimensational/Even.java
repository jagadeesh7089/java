package Twodimensational;

public class Even {
    public static void main(String[]args){
        int [][]ar={{10,14,4},{20,5,2},{3,9,11}};
        int sum=0;
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-1;j++){
                if(ar[i][j]%2==0){
                    sum=sum+ar[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    
}
