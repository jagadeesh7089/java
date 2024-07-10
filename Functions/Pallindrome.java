package Functions;

public class Pallindrome {
    static void palin(int num){
        int res=num;
        int rem;
        int sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }   
        if(res==sum){
            System.out.println("Given num is pallindrome");
        }
        else{
            System.out.println("Given num is not palindrome");
        }
    }
    public static void main(String[] args) {
       
        palin(121);
    }
}
