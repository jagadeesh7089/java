package Functions;

public class Rpower {
    static int pow(int n,int m){
        if(m==0){
            return 1;
        }
        else{
            return n*pow(n,m-1);
        }
    }
    public static void main(String[] args) {
        int res= pow(2,5);
        System.out.println(res);
    }
}
