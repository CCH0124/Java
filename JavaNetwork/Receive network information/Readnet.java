import java.io.*;
import java.net.*;

public class Readnet{
        public static void main(String[] args) {
                byte [] buff = new byte[1024];
                Socket readsocket = null; // 連接伺服器物件
                InputStream instr = null; // 讀取資料物件
                boolean cont = true;
                /**************************
                * args[0] Server Address  *
                * args[1] Port            *
                **************************/
                try{
                        readsocket = new Socket(args[0],Integer.parseInt(args[1])); 
                        instr = readsocket.getInputStream();
                }catch(Exception e){
                        System.err.println("Network Error");
                        System.exit(1);
                }
                // 讀取資料
                 while (cont) {
                        try{
                                // read data
                                int n = instr.read(buff);
                                // write
                                System.out.write(buff,0,n);
                        }catch(Exception e){
                                // data read 為空時
                                cont = false;
                        }
                 }
                 // 關閉連線
                 try{
                        instr.close();
                 }catch(Exception e){
                        System.err.println("Network Fail");
                        System.exit(1);
                 }
        }
}
