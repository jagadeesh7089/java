public class Polymorphism {

    static void add(double a,int b){
        System.out.println(a+b);
    }

    static void add(int a,double b){
        System.out.println(a+b);
    }

    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    static void add(String a,String b){
        System.out.println(a+b);
    }

    public static void main(String[]args){
        add(10,20,30);
        add(10.0,20);
        add("shankar","singamsetty");     
        
    }
    
    


}
