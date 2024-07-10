package Assignment;

public class Max {
   public static void main(String[] args) {
    int[]ar={94,54,34,22,45,33,23,12,3};
    int max=ar[0];
    for(int i=0;i<ar.length-1;i++){
        if(ar[i]>max){
            max=ar[i];
        }
    }
    System.out.println(max);
   }
    
}
