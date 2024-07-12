package Recursion;

public class Factorial {
    static int facto(int num){
        if(num==1){
            return 1;
        }
        return num*facto(num-1);
    }
    public static void main(String[] args) {
          int res=facto(3);
          System.out.println(res);
    }
    
}
