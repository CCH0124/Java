import java.io.*;

public class Readfile{
    
    public static void main(String[] argv){
        byte[] buff = new byte[1024];
        boolean cont = true;
        FileInputStream infile = null;
        /**********************************
        * 產生 infile 物件。讀取 File     *
        **********************************/
        try{
            infile = new FileInputStream(argv[0]);
        }catch(FileNotFoundException e){
            System.err.println("File Not Exist.");
            System.exit(1);
        }
        /**********************************
        * 處裡讀 File data                 *
        **********************************/
        while(cont){
            try{
                int n = infile.read(buff); // 從 File 讀入 data
                System.out.write(buff,0,n); // 寫入 System.out
            }catch(Exception e){
                // 控制迴圈（讀取完成）
                cont = false;
            }
        }
        /**********************************
        * 關閉讀取功能                     *
        **********************************/
        try{
            infile.close();
        }catch(IOException e){
            System.err.println("File Error.");
            System.exit(1);
        }
    }
}
