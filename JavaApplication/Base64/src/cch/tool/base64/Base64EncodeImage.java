package cch.tool.base64;

import java.io.File;
import java.util.Base64;

import cch.tool.file.DestinationFileManagement;
import cch.tool.file.EncodeFileSet;
import cch.tool.file.FileException;
import cch.tool.file.SourceFileManagement;
public class Base64EncodeImage {
	private String base64EncodeImage;
	
	private EncodeFileSet fp = new EncodeFileSet();
	private SourceFileManagement sfm = null;
	private DestinationFileManagement dfm = null;
	private File file = null;
	
	public String getBase64EncodeFile() {
		return base64EncodeImage;
	}
	public void setBase64EncodeFile(String base64EncodeImage) {
		this.base64EncodeImage = base64EncodeImage;
	}

	public void displayEncodeImage (String imageSrc){
		setBase64EncodeFile(Base64.getEncoder().encodeToString((fp.readData(imageSrc))));
		System.out.println(getBase64EncodeFile());
	}
	
	
	public Base64EncodeImage(String fileDst, String imageSrc){
	    file = new File(imageSrc);
	    sfm = new SourceFileManagement();
	    dfm = new DestinationFileManagement();
	    try {
            if(sfm.isSrcFileExists(file)){
                System.out.println(dfm.checkDstFile(fileDst));
                fp.saveEncodeImage(fileDst,imageSrc);
            }else{
                System.out.println("Source file error.");
            }
        } catch (FileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
}
