package day17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		try {
			reader = new FileReader("tempfile");
			char[] chars = new char[4];
			int readCount = 0;
			while ((readCount = reader.read(chars)) != -1) {
				System.out.println(new String(chars, 0, readCount));
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
