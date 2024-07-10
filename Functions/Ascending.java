package Functions;
import java.util.Arrays;
public class Ascending {
    int abc=200;
     static int[] Ascen(int d, int b,int c){
        int a[] = new int[3];
        a[0]=d;
        a[1]=b;
        a[2]=c;

        Arrays.sort(a);
        return a;

    }
    public static void main(String[] args) {
        Ascending d=new Ascending();
        int a[]=Ascen(3,5,2);
        System.out.println(Arrays.toString(a));
        System.out.println(d.abc);
        
    }
}
