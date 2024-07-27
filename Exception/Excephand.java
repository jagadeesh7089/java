package Exception;

public class Excephand {
     public static void main(String[]args){
        

       try {
          // System.out.println(100/0);
          int [] ar={12,43};
          System.out.println(ar[5]);

      }
      catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Array index out of bound");

       }

      catch (ArithmeticException e ) {
          System.out.println("Arithmetic Exception occured");
       } 
       
       catch (Exception e){
          System.out.println("Exception occured");
      }
      
     }
}
