import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	
	public String read(String filename) {
		
		StringBuffer bf=new StringBuffer();
		try {
			FileInputStream in = new FileInputStream(filename);
			int words;
			try {
				while((words=in.read())!=-1) {
					bf.append((char)(words));
				}
			in.close();
			//System.out.println(bf.toString());  
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
		return bf.toString();
	}
	
}
