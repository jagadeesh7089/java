public class Maxi {
    public static void main(String[]args){
        int num1=43;
        int num2=345;
         int res;
         int z=0;
         if(num1>num2){
            z++;
         }
         switch (z) {
            case 1:
                res=num1;
                break;
         
            default:
                res=num2;
                break;
         }

        
         System.out.println(res);

    }
    
}
