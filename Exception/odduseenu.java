// package Exception;

public class odduseenu {
    public static void main(String[] args) throws InterruptedException {
        
    //    m1();
        
    //     m2();

    Thread.sleep(3000);
    System.out.println("hiii");
    }

    static void m1() throws ArithmeticException {
        System.out.println("m1()");
        System.out.println(3/0);
    }

    static void m2() {
        System.out.println("m2()");
        System.out.println(3/0);
    }
   
}
