import java.util.Scanner;

public class d261{
    public static String Bee(long year){
        /*
        #######################################
        # femaleBee  母蜂                     #                             
        # maleBee    公蜂                     #           
        # fbTotal    母蜂總數                 #                      
        # mbtotal    公蜂總數                 #      
        ######################################
        */
        long femaleBee = 1,maleBee = 0,fbTotal=0,mbtotal=0;
        while(year > 0){
            fbTotal = maleBee + 1;
            mbtotal = femaleBee + maleBee;
            femaleBee = fbTotal;
            maleBee = mbtotal;
            year--;
        }
        return maleBee+" "+(femaleBee+maleBee);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N;
        while(sc.hasNextLong() &&  (N = sc.nextLong())!=-1)
            System.out.println(Bee(N));
    }
}