package Twodimensational;

public class Testsum {
    public static void main(String[] args) {
       int ar[][]={{21,43,56,45,4},{34,22,65,454,61},{34,54,23},{34,56,87,98},{23,67,55,45,34}};
       int sum=0;
       for(int i=0;i<=ar.length-1;i++){
        if(ar.length==ar[i].length){
            for(int j=0;j<=ar.length-1;j++){
                sum=sum+ar[i][j];
            }
        }
       }
       System.out.println(sum);
    }
    
}
