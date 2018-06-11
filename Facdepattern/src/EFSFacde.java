import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class EFSFacde {
	
	private FileReader reader;
	private FileWriter writer;
	private CipherMD5 strMD5;
	
	public EFSFacde() {
		reader=new FileReader();
		writer=new FileWriter();
		strMD5=new CipherMD5();
	}
	
	public void MD5file(String filenamein,String filenameout) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String read=reader.read(filenamein);
		String code=strMD5.strMD5(read);
		writer.write(filenameout, code);
	}

}
