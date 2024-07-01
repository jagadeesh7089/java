import java.util.Scanner;

public class units {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%10==4){
            System.out.println("Yes its have");
        }
        else{
            System.out.println("No its not~");
        }
    }
}
