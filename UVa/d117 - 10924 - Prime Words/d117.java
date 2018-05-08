import java.util.*;
public class d117{
    private static final String PRIME = "It is a prime word.";
    private static final String NOT_PRIME = "It is not a prime word.";
    public static int english(String str){
        int value = 0;
        for(int i=0; i<str.length(); i++)
            if(Character.isLowerCase(str.charAt(i)))
                value += (int)str.charAt(i) - (int)'a' + 1;// ASCII a=97
            else
                value += (int)str.charAt(i) - (int)'A' + 27;// ASCII A=65

        return value;
    }
    public static String isPrime(int value){
        for(int i = 2; i <= Math.floor(Math.sqrt(value)); i++)
            if(value % i == 0)
                return NOT_PRIME;    
        return PRIME;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.printf("%s\n",isPrime(english(str)));
        }
    }
}