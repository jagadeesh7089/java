public class Negorpos {

    public static void main(String[]args){
        int num=342;
       String res;
        int c=0;
        if(num>0){
            c++;
        }
         switch (c) {
            case 1:
                res="Positive";
                break;
         
            default:
                res="Negative";
                break;
         }
         System.out.println(res);
    }
    
}
