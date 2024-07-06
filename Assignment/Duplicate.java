package Assignment;
public class Duplicate {
    public static void main(String[] args) {
        int[]ar={18,15,24,29,12,18,15,29,12,58,24,55};
        for(int i=0;i<=ar.length-1;i++){
            int j;
            for(j=i;j>0;j--){  
                if(ar[i]==ar[j-1]){
                    break;  
                }
            }
            if(j==0){
                System.out.println(ar[i]);
            }
        }
    }
}
