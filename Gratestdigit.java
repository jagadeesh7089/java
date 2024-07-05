import java.util.Scanner;

public class Gratestdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=0;
        int rem=0;
        while(num!=0){

            rem=num%10;
           if(rem>val){
            val=rem;
           }
            num=num/10;
             
            }
            System.out.println(val);
        }
        
    }

