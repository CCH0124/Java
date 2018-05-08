import java.io.*;
import java.net.*;
import java.util.*;

public class Netclock{
        public static void main(String [] argv){
                ServerSocket serversocket = null;// Socket Server
                Socket sock; // 讀寫 socket 物件
                OutputStream out; // 輸出資料流
                String outstr; // 存放輸出資料
                int i; // 迴圈控制變數
                Date d; // 日期物件

                try{
                        serversocket = new ServerSocket(6000,300); // Port：6000，最大連線數：300
                       
                        while(true){
                                sock = serversocket.accept(); // 接受連接
                                d = new Date();
                                outstr = "\n" + "Hello, this is Netclock server."
                                        + "\n" + d.toString() + "\n" + "Thank you." + "\n";
                                // 輸出資料
                                out = sock.getOutputStream();
                                for(i=0; i<outstr.length(); i++)
                                        out.write((int)outstr.charAt(i));
                                out.write('\n');
                                // 關閉連線
                                sock.close();
                        }
                }catch(IOException e){
                        System.exit(1);
                }
        }
}
