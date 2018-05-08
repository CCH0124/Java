package cch.tool.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class FileSet {
    
    /*
     * 刪除檔案
     *  delete a non-existing file retutn flase
     */
    public Boolean fileDelete(File file){
        return file.delete();
    }
    
    /*
     * 建立暫存檔
     * param length >= 3
     */
    // File.createTempFile("Base64File", ".b64", New File("C:"));
    public File createTempFile(String fileName,String attributes){
        File file = null;
        try {
            file = File.createTempFile(fileName,attributes);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return file;
    }
    /*
     * 檔案最後修改時間
     */
    public Date fileLastChangeTime(File file){
        long millisec;
        millisec = file.lastModified();
        return new Date(millisec);
    }
    /*
     * 列出硬碟分割（C: D:）
     */
    public File[] diskList(){
        return File.listRoots();
    } 
    
    
   
}
