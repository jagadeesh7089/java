package Recursion;

public class Pallindrome {
    static int pallin(int num,int sum){
        if(num==0){
            return sum;
        }
        sum=sum*10+num%10;
        return pallin(num/10,sum);

    }
    public static void main(String[] args) {
        int x=121;
        int res=pallin(x,0);
        if(res==x){
            System.out.println("Given num is pallindrome");
        }
        else{
            System.out.println("Given num is not pallindrome");
        }
    }

    
}
