import java.util.Scanner;

class Even2{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the num");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
}
}
