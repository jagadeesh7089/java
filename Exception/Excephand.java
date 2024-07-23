package Exception;

public class Excephand {
     public static void main(String[]args){
      try {
        // System.out.println(100/0);
        int []ar={12,34,23};
          System.out.println(ar[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e ){
        System.out.println("chusuko ra babbu");
     }
        
      
      catch (Exception Arithmetic ) {
        // TODO: handle exception
        System.out.println("Vadhu seenu.");
      }
      
     }
}
