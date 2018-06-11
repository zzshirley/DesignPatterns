import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		EFSFacde efs=new EFSFacde();
		efs.MD5file("in.txt", "out.txt");
	}
}
