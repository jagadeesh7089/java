package Advpattern;

public class Pattern6 {
    public static void main(String[] args) {
       // NUMBER 3
        for(int i=2;i<=8;i++){
         for(int k=7;k>=i;k--){
            System.out.print(" ");
         }
         for(int j=1;j<i;j++){
            if(i%2==0){
                System.out.print(i);
            }
            else{
                System.out.print("#");
            }
         }
       
         System.out.println("");   
        }
        
    }
    
}
