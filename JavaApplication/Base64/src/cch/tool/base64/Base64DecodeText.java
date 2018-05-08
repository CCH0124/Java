package cch.tool.base64;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class Base64DecodeText {
	private byte [] base64decoded;

	public byte[] getBase64decoded() {
		return base64decoded;
	}

	public void setBase64decoded(byte[] base64decoded) {
		this.base64decoded = base64decoded;
	}
	
	public void displayOriginalString(String base64decoded){
		
		try {
			setBase64decoded(Base64.getDecoder().decode(base64decoded));
			System.out.println( new String(getBase64decoded(), "utf-8"));
		} catch (UnsupportedEncodingException ue) {
			// TODO Auto-generated catch block
			ue.printStackTrace();
			System.out.println(ue.getMessage());
		}
	}
	
	public Base64DecodeText(String s){
		displayOriginalString(s);
	}
}
