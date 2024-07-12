import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
         int max=0;
         int min1=0;
         int min2=0;

         if(x>y){
             if(x>z){
                 max=x;
                min1=y;
                min2=z;
            }
            else{
                 max=z;
                 min1=x;
                 min2=y;

            }
         }
         else{
            if(y>z){
                max=y;
                min1=z;
                min2=x;
            }
            else{
                max=z;
                min1=x;
                min2=y;
            }
         }
        
         for(int i=1;i<=x*y*z;i++){ 
            if(max*i%min1==0 && max*i%min2==0){
                System.out.println(max*i);
                break;
            }
         }

    }
}
