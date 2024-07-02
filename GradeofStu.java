import java.util.Scanner;

 class GradeofStu {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double tot= (x+y+z)/300.0;
        double per=tot*100;
        System.out.println(per);
    
       
    }   
}
