import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int ar[]={12,65,3,78,5,4,23};
        int temp;
        for(int i=0;i<=ar.length-1;i++){
            
            for(int j=0;j<=ar.length-2;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[ar.length-2]);
    }
}
