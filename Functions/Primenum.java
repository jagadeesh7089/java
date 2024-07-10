package Functions;

public class Primenum {
    static void prime(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                c+=1;
            }
        }
        if(c<=2){
            System.out.println("Given num is Prime num");
        }
        else{
            System.out.println("Given num is not Prime num");
        }
    }
    public static void main(String[] args) {
        prime(7);
        prime(9);
    }
    
}
