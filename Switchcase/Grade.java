public class Grade {
    public static void main(String[]args){
        int per=0;
         String grade;
         switch (per/10) {
            case 9:
                grade="O";
                break;
            case 8:
                grade="A";
                break;
            case 7:
                grade="B";
                break;
            case 6:
                grade="C";
                break;
            case 5:
                grade="D";
                break;
            case 4:
                grade="E";
                break;
                
             default:
                grade="Fail";
                break;  
                
         }  

         System.out.println(grade);
    }
    
}
