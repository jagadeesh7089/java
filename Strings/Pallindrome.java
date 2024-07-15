package Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String s1="abba";
        String s2="";
        for(int i=0;i<=s1.length()-1;i++){
            s2=s1.charAt(i)+s2;
        }
        // System.out.println(s2);
        if(s1==s2){
            System.out.println("Given String is Pallindrome");
        }
        else{
            System.out.println("Given String is not Pallindrome");
        }
    }
    
}
