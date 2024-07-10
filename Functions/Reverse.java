package Functions;

public class Reverse {
    static void rev(int num){
        int rem=0;
        int sum=0;
        while(num !=0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        rev(456);
        
    }
}
