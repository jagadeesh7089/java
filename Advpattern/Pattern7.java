package Advpattern;

public class Pattern7 {
    public static void main(String[] args) {
      // NUMBER 4
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                if(j>i){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
               
            }
            System.out.println("");
        }
    }
    
}
