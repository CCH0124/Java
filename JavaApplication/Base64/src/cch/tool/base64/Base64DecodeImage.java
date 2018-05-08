package cch.tool.base64;

import java.io.File;

import cch.tool.file.DecodeFileSet;
import cch.tool.file.DestinationFileManagement;
import cch.tool.file.FileException;
import cch.tool.file.SourceFileManagement;

//import cch.tool.file.*;
public class Base64DecodeImage {
	
    private DestinationFileManagement dfm;
    private DecodeFileSet fp = null;
    private SourceFileManagement sfm = null;
    private File file = null;
    
	public Base64DecodeImage(String fileSrc,String imageDst){
	    fp = new DecodeFileSet();
	    dfm = new DestinationFileManagement();
	    sfm = new SourceFileManagement();
	    file = new File(fileSrc);
	    
        try {
            if(sfm.isSrcFileExists(file)){
                System.out.println(dfm.checkDstFile(imageDst));
                fp.decodeImage(fileSrc,imageDst);
            }else{
                System.out.println("Source file error.");
            }
        } catch (FileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
	
}
