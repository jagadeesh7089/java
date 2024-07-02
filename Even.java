import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int x=sc.nextInt();
            if(x%2==0){
                System.out.println(x);
            }
        }

    }
}
