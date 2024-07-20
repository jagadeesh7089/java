
  class Employee{
    public int  x=100;
    private int y=433;
    int z=43;
    int e=y;
 
 }
    public class Public {
    
    public static void main(String[] args) {
       
        // Employee e1=new Public().new Employee();
        Employee e1=new Employee();
        System.out.println(e1.x);
        System.out.println(e1.z);
        System.out.println(e1.e);
        System.out.println(e1.y);
        
    }
    
}
