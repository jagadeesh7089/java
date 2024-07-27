public class Days {
   public static void main(String[]args){
      int num=4;
      String day;
      switch (num) {
        case 1:
            day="Monday";
            break;
        case 2:
            day="Tuesday";
            break;
        case 3:
            day="Wednesday" ;
            break;
        case 4:
            day="Thrusday";
            break;
        case 5:
            day="Friday";
            break;
        case 6:
            day="Saturday";
            break;
        case 7:
            day="Sunday";
            break;                       
      
        default:
            day="Invalid Number";
            break;
      }
      System.out.printf("The day is %s",day);
   }
    
}
