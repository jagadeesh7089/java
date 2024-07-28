public class Evenorodd {
    public static void main(String[]args){
        int num=3221;
        String res;
        int c=0;  
        if(num%2==0){
            c++;
        }

        switch (c) {
            case 1:
                res="Even";
                break;
        
            default:
                res="odd";
                break;
        }
        System.out.println(res);
    }
    
}
