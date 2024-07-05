import java.util.Scanner;

public class Maxandmin {
    public static void main(String[] args) {
        int min=0;
        int max=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int x=sc.nextInt();
            if(i==1){
                min=x;
                max=x;
            }
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println("max::"+max);
        System.out.println("min::"+min);
    }
}
