package Functions;

public class Factorial {
    static int facto(int num){
        int p=1;
        for(int i=num;i>=1;i--){
            p*=i;
        }
        return p;
    }
    public static void main(String[] args) {
        int res=facto(5);
        System.out.println(res);
    }
}
