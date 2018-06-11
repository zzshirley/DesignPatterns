import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	
	public void write(String filename,String words) {
		
		try {
			FileOutputStream fw = new FileOutputStream(filename, true);
			try {
				fw.write(words.getBytes());
				fw.write("\n".getBytes());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("操作错误！");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在！");
			e.printStackTrace();
		}
		
	}

}
