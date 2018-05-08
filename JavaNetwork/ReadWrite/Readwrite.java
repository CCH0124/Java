import java.io.*;
public class Readwrite{
    public static void main(String [] args){
        byte[] buff = new byte[1024];
        while(true){
            try{
                int n = System.in.read(buff); // System.in 讀取資料
                System.out.write(buff,0,n); // 寫入 System.out 
            }catch(Exception e){
                System.exit(1);
            }
        }    
    }
}
