package cch.tool.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;

public class DecodeFileSet {
    private InputStream fileInputStream = null;
    private OutputStream  fileOutputStream = null;
    private  File file = null;
    private final int BUFFER_SIZE = 1024; 
    private byte[] bytes = new byte[BUFFER_SIZE];
    
    
    
    public void decodeImage(String fileSrc,String imageDst){
        try {
            file = new File(imageDst);
            fileInputStream = Base64.getDecoder().wrap(new FileInputStream(fileSrc));
            fileOutputStream = new FileOutputStream(file); 
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            fileInputStream.close();
            fileOutputStream.flush();  
            fileOutputStream.close(); 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
