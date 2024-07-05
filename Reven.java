import java.util.Scanner;

public class Reven {
    public static void main(String[] args) {
        // int x=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=4;i++){
           int x=sc.nextInt();
             if(x%2==0){
                 System.out.println(x);
            }
        }

    }
}
