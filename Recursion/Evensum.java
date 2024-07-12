package Recursion;

public class Evensum {
    static int sum(int n,int sun){
      if(n>20){
        return sun;
      }
      if(n%2==0){
        sun=sun+n;
      }
      return sum(n+1,sun);

    }
    public static void main(String[] args) {
      int res= sum(1,0);
      System.out.println(res);
    }
}
