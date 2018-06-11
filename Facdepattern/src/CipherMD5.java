import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class CipherMD5 {
	
	public String strMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		 MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		 BASE64Encoder base64en = new BASE64Encoder();
	        //加密后的字符串
		 String newstr=base64en.encode(messageDigest.digest(str.getBytes("utf-8")));
		 System.out.println(newstr);
	     return newstr;
	}

}
