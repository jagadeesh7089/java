package Recursion;

public class Natural {
    static void natu(int n, int m){
        if(n<m){      
            natu(n+1,m);
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        natu(1,20);
    }
}
