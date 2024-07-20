package Strings;

public class Lowestf {
    public static void main(String[] args) {
        String s1="  jagadeesh  ";
        s1=s1.trim();
        int min=0;
        char ch=' ';
        for(int i=0;i<=s1.length()-1;i++){
            int count=0;
            for(int j=i;j<s1.length()-1;j++){
                if(s1.charAt(i)==s1.charAt(j+1)){
                    count++;
                }

            }
             for(int k=i;k>0;k--){
                if(s1.charAt(i)==s1.charAt(k-1))
                count++;
             }
            if(count==0){
                ch=s1.charAt(i);
                System.out.print(ch+" ");
                
            }

        }


    }
    
}
