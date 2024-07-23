public class Reference {
    public static void main(String[]args){
        class A{
            int x=100;
            int y=8594;
             void callme(){
                System.out.println("Class A callme method");

              }
        }
        class B extends A{
            int x=344;
            int y=230;
            void callme(){
                System.out.println("Class B callme method ");
  
            }
        }

        class C extends A {
             int x=343;
             int z=944;
             void callme() {
                System.out.println("Class c callme method");
             }
        }

        // B ob1=new B();
        // System.out.println(ob1.y);

         A oa1=new B();

        //   System.out.println(oa1.y);

         /*The above statement gives an error
         because we cannot access the class 
         b properties  with the class A references */   
        
            System.out.println(oa1.y);
            oa1.callme();

            A oar;

            oar=new A();
            System.out.println(oar.x);
            oar.callme();

            oar=new B();
            System.out.println(oar.x);
            oar.callme();

            oar =new C();
            System.out.println(oar.x);
            oar.callme();

        
    }
    
}
