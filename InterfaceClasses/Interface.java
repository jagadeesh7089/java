package InterfaceClasses;

public class Interface {
    public static void main(String[]args){
        interface Iface {
            /* By default interface methods are Public access modifier */
            void abc();
            void rcb();
        //    abstract int x=9;
            /*Using default keyword we can declare the method with defination also */
        }

       /*abstract */ class Child implements Iface{
             /*By default Class methods are default access modifiers  */

           public void abc(){ 
                System.out.println("abc interfaced");
            }
            public void rcb(){
                System.out.println("rcb interfaced");
            }
            void csk(){
                System.out.println("Non-inherited method");
            }
        
        }
            
        Iface of1=new Child();
        of1.abc();
        
        // of1.csk();/* we cannot access the non-inherited method with parent class reference variable */

        Child oc1=new Child();
        oc1.rcb();
    }
    
}