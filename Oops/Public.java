
  class Employee{
     public int x;
     private int y;
     int z;
     Employee( int a,int b,int c){
      this.x=a;
      this.y=b;
      this.z=c;
     }

     private void abc(){
      System.out.println("this is a Private access method");
     }
       void xyz(){
       System.out.println("this is a Public access method");
     }
       void rcb(){
       System.out.println("But we can  access the private method in the same class of the public method.");
       abc();
     }
     
 }
    public class Public {   
    
    public static void main(String[] args) {
       
        // Employee e1=new Public().new Employee();
        Employee e1=new Employee(100,233,445);
        System.out.println(e1.x);
        System.out.println(e1.z);
        // System.out.println(e1.y);
        e1.rcb();
        
    }
    
}
