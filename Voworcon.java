import java.util.Scanner;

class Voworcon {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         char c=sc.next().charAt(0);
         if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
            System.out.println("Given character is Vowel");
         }
         else{
            System.out.println("Given character is Constant");
         }
    }
}
