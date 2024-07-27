package Exception;

import java.io.EOFException;

public class Test {

    static void abc() throws ArithmeticException{
        // System.out.println(100/0);
        throw new ArithmeticException() ;
       
    }
    public static void main(String[] args){
         try{
            Test.abc();
         }
         catch(ArithmeticException e){
            System.out.println("pora bacha");
         }
           
    }
    
}
