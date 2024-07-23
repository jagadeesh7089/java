public class Constructor {

    public static void main(String[] args) {
        class Test{
            int x;
            int y;
            Test(){
                System.out.println("constructor 1");
            }
            Test(int a){
                System.out.println("Constructor 2");
            }
            Test( String s1){
                System.out.println("String Constructor");
            }
        }

        Test t1=new Test("jagadeesh");
        Test t2=new Test();
        
    }
    
    
}
