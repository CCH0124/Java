import java.io.*;
public class Writefile{
    public static void main(String [] args){
        byte[] buff = new byte[1024];
        boolean cont = true;
        FileOutputStream outfile = null; // File 輸出物件
        /**********************************
        * 產生 outfile 物件。輸出 File     *
        **********************************/
        try{
            outfile = new FileOutputStream(args[0]);
        }catch(FileNotFoundException e){
            // 無法開起 File
            System.err.println("File Not Exist.");
            System.exit(1);
        }
        /**********************************
        * 處裡讀寫                         *
        **********************************/
        while(cont){
            try{
                // read data
                int n = System.in.read(buff);
                // write data
                System.out.write(buff,0,n);
                // 用 . 作為結束
                if(buff[0]=='.') cont = false;
                else outfile.write(buff,0,n);
            }catch(Exception e){
                System.exit(1);
            }
        }
        /**********************************
        * 關閉檔案                         *
        **********************************/
        try{
            // 關閉
            outfile.close();
        }catch(IOException e){
            // 關閉檔案錯誤
            System.err.println("File Error.");
            System.exit(1);
        }
    }
}
