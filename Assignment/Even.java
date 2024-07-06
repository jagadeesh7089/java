package Assignment;

import java.util.Arrays;


public class Even {
    public static void main(String[] args) {
    int ev=0;
    int od=0;
     int [] ar={52,69,48,333,58,1};
    //  int [] br=new int[ar.length];
    //  int [] cr=new int[ar.length];
    
     for(int i=0;i<=ar.length-1;i++){
        if(ar[i]%2==0){
            ev++;
        }
        else{
            od++;
        }
     }
     int[] br=new int[ev];
     int[]cr=new int[od];
     int evin=0;
     int odin=0;
      for(int j=0;j<=ar.length-1;j++){
        if(ar[j]%2==0){
            br[evin]=ar[j];
            evin++;
        }
        else{
            cr[odin]=ar[j];
            odin++;
        }
      }

    System.out.println(Arrays.toString(br));
    System.out.println(Arrays.toString(cr));

     
     

    }
    
}
