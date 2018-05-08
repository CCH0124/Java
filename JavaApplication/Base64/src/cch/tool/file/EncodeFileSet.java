package cch.tool.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;

public class EncodeFileSet {
    private InputStream fileInputStream = null;
    private OutputStream  fileOutputStream = null;
    private File file = null;
    private byte [] imageData = null;
    private SourceFileManagement sfm = null;
    private FileSet fs = null;
    /*
     * 將圖片來源帶入
     * return 圖片的 byte 資料
     */
    public byte[] readData(String imageSrc){
        file = new File(imageSrc);
        sfm = new SourceFileManagement();
        try {
            if(sfm.isSrcFileExists(file)){
                try {
                    fileInputStream = new FileInputStream(file);
                    imageData = new byte[fileInputStream.available()];  
                    fileInputStream.read(imageData);
                    fileInputStream.close();
                        
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }   
            }
        } catch (FileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return imageData;
    }
    /*
     * 儲存編碼的圖片
     * fileDst 檔案存的路徑
     * imageSrc 要編碼圖片來源
     */
    public void saveEncodeImage(String fileDst,String imageSrc){
        try {
            fileOutputStream = Base64.getEncoder().wrap(new FileOutputStream(fileDst));
            fileOutputStream.write(readData(imageSrc));
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
    /*
     * 用暫存檔儲存編碼圖片
     * imageSrc 圖片來源
     */
    public void saveEncodeImageTemp(String imageSrc){
        fs = new FileSet();
        File f = fs.createTempFile();
        try {
            fileOutputStream = Base64.getEncoder().wrap(new FileOutputStream(f));
            fileOutputStream.write(readData(imageSrc));
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println(fs.fileAbsolutePath(f));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
