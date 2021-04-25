
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("myfile");
			byte[] bytes= {97,98,99,100};
			fos.write(bytes);
			fos.write(bytes,0,2);
            fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
