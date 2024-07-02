import java.util.Scanner;

public class Alphabet {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Character");
     char x=sc.next().charAt(0);
     
      if(x>=47&&x<=57){
        System.out.println("Given char is digit");
      }
      else{
        if(x>=65&&x<=90||x>=97&&x<=122){
            System.out.println("Given char is Alphabet");
        }
        else{
            System.out.println("Given char us Special char");
        }
      }
    //   System.out.println((int)'0');

       
    }
}
