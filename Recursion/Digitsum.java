package Recursion;

public class Digitsum {
    static int digit(int num,int sum){
        if(num==0){
            return sum;
        }
        sum=sum+num%10;
        return  digit(num/10,sum);
    }
    public static void main(String[] args){
         int res=digit(546,0);
        System.out.println(res);
    }
    
}
