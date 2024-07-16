package Oops;

public class Instance {
    public static void main(String[] args) {
        class Employee {
            String fullname;
            int basic;
            int hra;
            int pfund;
            double ptax;
            Employee (String fn,int b,int h,int pf, double pt){
                this.fullname=fn;
                this.basic=b;
                this.hra=h;
                this.pfund=pf;
                this.ptax=pt;
            }
             double getsalary(){
                 return this.basic+((double)this.hra/100*this.basic)-(this.pfund*2)-((double)this.ptax/100*this.basic);
            }
            
        }

        Employee e1=new Employee("Sathi",35000,20,2000,1.6);
        double res=e1.getsalary();
        System.out.println(res);
    }
    
}
