public class Voworcon {
    public static void main(String[]args){
        char ch='b';
        String res;
        switch (ch) {
            case 'a' :
                res="Vowel";
                break;
            case 'e':
                res="vowel";
                break;
            case 'i':
                res="vowel";
                break;
            case 'o':
                res="vowel";
                break;
                
            case 'u':
                res="vowel";
                break;

            default:
                res="constant";
                break;
        }

        System.err.println(res);
    }
    
}
