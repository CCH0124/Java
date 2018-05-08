package cch.tool.file;

import java.io.File;
import java.io.IOException;

public class DestinationFileManagement {
    private  File file = null;
    private Boolean b = null;
   
    public Boolean isDstFileExists(File file){
        this.file = file;
        return file.exists();
    }
    /*
     * 建立檔案
     * 已建立 flase 否則 true
     */
    public Boolean createNewFile(File file){
        this.file = file;
        try {
            b = file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }
    /*
     * 取得檔案名稱
     */
    public String getFileName(File file){
        this.file = file;
        return file.getName();
    }
    /*
     * 取得父節點目錄
     */
    public File getFileParent(File file){
        this.file = file;
        return file.getParentFile();
    }
    /*
     * 是否為檔案
     */
    public Boolean isDstFile(File file){
        this.file = file;
        return file.isFile();
    }
    /*
     * 是否為目錄
     */
    public Boolean isDstDir(File file){
        this.file = file;
        return file.isDirectory();
    }
    /*
     * 是否為絕對為路徑
     */
    public Boolean isDstAbsolute(File file) throws FileException{
        this.file = file;
        b = false;
        if(!file.isAbsolute()){
            throw new FileException("Please enter the absolute path.");
        }else{
            return !b;
        }
    }
    /*
     * 取得檔案絕對路徑
     */
    public String fileAbsolutePath(File file){
        this.file = file;
        return file.getAbsolutePath();
    }
    /*
     * 當檔案或目錄不存在時建立
     */
    public String checkDstFile(String fileDst){
        file = new File(fileDst);
        File parentFile = null;
        String fileName = getFileName(file);        
        try {
            if(isDstAbsolute(file)){
                if(isDstFileExists(file)){ // 目的地是存在
                    if(isDstDir(file)){ // 如果為目錄
                        System.out.println("請輸入檔案路徑");                        
                    }else{                 
                        return fileAbsolutePath(file);
                    }
                 }else{                    
                     parentFile = getFileParent(file); // 目的檔案不存在，取得父節點
                     if(isDstFileExists(parentFile)){ // 父節點是存在                                                  
                         if(createNewFile(file)){ // 建立檔案
                             System.out.println("建立"+fileName+"成功");                             
                         }
                         return fileAbsolutePath(file);
                     }else{
                         // file 跑掉                         
                         System.out.println("建立目錄中");
                         parentFile.mkdirs(); // 必要的和不存在的父目錄的目錄
                         if(isDstFile(file)){
                             System.out.println("建立完成");                           
                         }else{
                             System.out.println("建立"+fileName+"中");
                             createNewFile(file);
                         }               
                     }
                 }
            }
        } catch (FileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return fileAbsolutePath(file);
    }
}
