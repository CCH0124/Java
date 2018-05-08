import java.util.Scanner;

public class d186{
    public static int square_Numbers(int num1,int num2){
        int count = 0;
        for(int i=(int)Math.sqrt(num1); i<=(int)Math.sqrt(num2); i++) //縮小 i 跑的範圍
            if(num1!=0 && Math.pow(i, 2) >= num1 && Math.pow(i, 2)<= num2)
                count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0;
        while(((num1 = sc.nextInt())!=0 && (num2 = sc.nextInt())!=0 ))
                System.out.println(square_Numbers(num1,num2));

    }
}