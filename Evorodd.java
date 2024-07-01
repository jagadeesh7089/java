import java.util.Scanner;

public class Evorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x%2==0?"Given num is even":"Given  num is odd");
    }
}
