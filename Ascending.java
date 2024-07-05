import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x<y&&x<z){
            if(y<z){
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
            else{
                System.out.println(x);
                System.out.println(z);
                System.out.println(y);
            }
            
        }
        else{
            if(y<z){
                if(x<z){
                    System.out.println(y);
                    System.out.println(x);
                    System.out.println(z);
                }
                else{
                    System.out.println(y);
                    System.out.println(z);
                    System.out.println(x);
                }
                
            }
            else{
                if(x<y){
                    System.out.println(z);
                    System.out.println(x);
                    System.out.println(y);
                }
                else{
                    System.out.println(z);
                    System.out.println(y);
                    System.out.println(x);
                }
            }
        }
    }
}
