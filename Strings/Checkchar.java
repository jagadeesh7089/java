package Strings;
import java.util.Scanner;
 
public class Checkchar{
    public static void main(String[] args) {
        String str="jagadeesh";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char :: ");
        char s=sc.next().charAt(0);
        boolean d=false;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==s){
                d=true;
                break;

            } 
        }
        System.out.println(d?true:false);


    }
    
}
