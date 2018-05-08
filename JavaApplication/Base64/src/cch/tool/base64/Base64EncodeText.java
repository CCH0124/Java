package cch.tool.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EncodeText {
	private String base64encode;
	
	public String getBase64encodeString() {
		return base64encode;
	}

	public void setBase64encodeString(String base64encode) {
		this.base64encode = base64encode;
	}
	/*
	 * 取得文字 Encode 結果 
	 */
	public String getEncode(String s){
		try{
			s = Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
		}catch(UnsupportedEncodingException ue){
			ue.printStackTrace();
		}
		return s;
	}
	/*
	 * 顯示 encode 結果
	 */
	public void displayEncodeString(String s){
		setBase64encodeString(getEncode(s));
		System.out.println(getBase64encodeString());
	}
	
	public Base64EncodeText(String s){
		displayEncodeString(s);
	}
	
}
