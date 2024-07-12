package Assignment;

public class Rmv {
    public static void main(String[] args) {
        String s="12312";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char ch1=s.charAt(j);
                if(ch==ch1){
                    System.out.println(s.substring(0, j));
                    System.out.println(s.substring(j+1));
                    System.out.println();
                    s=s.substring(0, j)+s.substring(j+1);
                    System.out.println(s);
                    System.out.println();
                    System.out.println();
                }
            }
        }
        System.out.println(s);
    }
}
