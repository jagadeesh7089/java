package Functions;

public class Digitc {
    static void count(int num){
        int c=0;
        
        while(num!=0){
          c+=1;  
          num=num/10;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
       count(34539);
       count(231);
       count(349291103);
       count(2);
    
    }
}
