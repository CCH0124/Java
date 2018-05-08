import java.util.Scanner;
import java.math.BigInteger;
public class d047{
    private final static BigInteger NUM_400=new BigInteger("400");
	private final static BigInteger NUM_4=new BigInteger("4");
	private final static BigInteger NUM_100=new BigInteger("100");
	private final static BigInteger NUM_15=new BigInteger("15");
	private final static BigInteger NUM_55=new BigInteger("55");
    private static boolean isLeap (BigInteger year) {
		return year.mod(NUM_400).equals(BigInteger.ZERO) || (year.mod(NUM_4).equals(BigInteger.ZERO) && !year.mod(NUM_100).equals(BigInteger.ZERO));
    }
    public static boolean leap(BigInteger year){
        boolean is_leap = isLeap(year);
            return is_leap;
    }
    public static boolean ishuluculu(BigInteger year){
        boolean huluculu = year.mod(NUM_15).equals(BigInteger.ZERO);
        return huluculu;
    }
    public static boolean isbulukulu(BigInteger year){
        boolean bulukulu = year.mod(NUM_55).equals(BigInteger.ZERO) && leap(year);
        return bulukulu;
    }
    public static boolean isordinary (BigInteger year){
        boolean ordinary = (!(leap(year) || ishuluculu(year) || isbulukulu(year)));
        return ordinary;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = 0;
        while(sc.hasNextBigInteger()){
            String number = sc.nextLine();
            BigInteger year=new BigInteger(number);
            if(ln++ > 0)
                System.out.println();
            if (leap(year))
                System.out.println("This is leap year.");
            if (ishuluculu(year))
                System.out.println("This is huluculu festival year.");
            if (isbulukulu(year))
                System.out.println("This is bulukulu festival year.");
            if (isordinary(year))
                System.out.println("This is an ordinary year.");
            }
    }
}