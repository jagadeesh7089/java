package Datastructures;

public class Static {
    public static void main (String[]args){
        class Employee{
            int x=100;
            static int c=0;
            Employee(){`
                this.c=++c;
            }
            void abc(){
                System.out.println("abc is instance method ");
            }
            void xyz(){
                System.out.println("This is Static method");
            }

        }

        
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        Employee e5=new Employee();
        Employee e6=new Employee();
        Employee e7=new Employee();
        Employee e8=new Employee();
        Employee e9=new Employee();
        System.out.println(Employee.c);
    }
    
}
