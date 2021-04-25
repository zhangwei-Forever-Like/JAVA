import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		String s="";
		try {
			fis = new FileInputStream("F:\\da\\1");
		        
				while(fis.read()!=-1) {
                    s+=fis.read();
					System.out.println(s);
					s="";
				}
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
