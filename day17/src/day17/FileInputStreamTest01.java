package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\a.txt");
			while (true) {
				int readDate = fis.read();
				if (readDate == -1) {
					break;
				}
				System.out.println(readDate);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
