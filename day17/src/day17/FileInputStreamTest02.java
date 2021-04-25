package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\a.txt");
			byte[] bytes = new byte[4];

//			while (fis.read(bytes) != -1) {
//				int readCount = fis.read(bytes);
//				System.out.println(readCount);
//				System.out.println(new String(bytes, 0, readCount));
//
//			}
			while (true) {
				int readCount = fis.read(bytes);
				if (readCount == -1) {
					break;
				}
				System.out.println(new String(bytes, 0, readCount));
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
