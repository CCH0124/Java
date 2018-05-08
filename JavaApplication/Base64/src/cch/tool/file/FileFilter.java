package cch.tool.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter{
    private String dotFilter;
    private File file = null;
    private FilenameFilter filter = null;
    private String[] paths;
    
    public FileFilter() {
        
    }
    
    public FileFilter(String ext) {
        dotFilter = "." + ext;
    }
    
    public void filterImage(String dirPath){
        file = new File(dirPath);
        filter = new FileFilter("jpg");
        paths = file.list(filter);
        for(String path:paths){
           System.out.println(path);
        }
    }
    @Override
    public boolean accept(File dir, String name) {
        // TODO Auto-generated method stub
        return name.endsWith(dotFilter);
    }
    
    
}
