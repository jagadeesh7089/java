package Assignment;
import java.util.Arrays;
public class Adarray {
    public static void main(String[]args){
        int []ar={23,59,3,45,2,67,5,89,65,487};
         int temp=0;
        for(int i=0;i<=ar.length-1;i++){
              if(i<ar.length/2){
                for(int j=i;j<(ar.length/2)-1;j++){
                    if(ar[i]>ar[j+1]){
                        temp=ar[i];
                        ar[i]=ar[j+1];
                        ar[j+1]=temp;
                    }
                }  
              }
              else{
                  for(int k=i;k<ar.length-1;k++){
                 
                    if(ar[i]<ar[k+1]){
                        temp=ar[i];
                        ar[i]=ar[k+1];
                        ar[k+1]=temp;
                    }
                  }
              }
        
        }
            System.out.println(Arrays.toString(ar));
        
    }
    
}
