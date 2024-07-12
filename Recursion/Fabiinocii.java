package Recursion;

public class Fabiinocii {
  static int fabo(int num){
    if(num==0){
        return 0;
    }
    if(num==1){return 1;}
      return fabo(num-1)+fabo(num-2);
  }
    public static void main(String[] args){
        int res=fabo(10);
        System.out.println(res);
    }
    
}
