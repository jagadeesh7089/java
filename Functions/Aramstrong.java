package Functions;

public class Aramstrong {
    
    static void aram(int num){
        int c=0;
        int rem;
        int sum=0;
        int res=0;
        int tot=num;
        while(num !=0){
         rem=num%10; 
         c+=1;
         sum=sum*10+rem;
         num=num/10;
        }
        
        
        while(sum!=0){
            rem=sum%10;
            res=res+((int)Math.pow(rem,c));
            sum=sum/10;
        }
        
        if(res==tot){
            System.out.println("Given num is AramStrong");
        }
        else{
            System.out.println("Given num is not aramStrong");
        }
    }
    public static void main(String[] args) {
       aram(15);
    }
}
