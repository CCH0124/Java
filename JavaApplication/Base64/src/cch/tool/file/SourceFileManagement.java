package cch.tool.file;

import java.io.File;

public class SourceFileManagement {
    private Boolean b = null;
    /*
     * 確認檔案是否存在
     */
    public Boolean isSrcFileExists(File file) throws FileException{
        b = false;
        if(file.isFile()){
            return !b;
        }
        return b;
    }
}
