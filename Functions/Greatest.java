package Functions;

public class Greatest {
    static int Great(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String[] args) {
        int res=Great(23,65,7);
        System.out.println(res);
    }
}
