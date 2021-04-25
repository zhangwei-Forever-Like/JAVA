package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputeStreamTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\a.txt");
			System.out.println("剩余多少个字节没有读：" + fis.available());
//			int readByte = fis.read();
			byte[] bytes = new byte[fis.available()];
			int readCount = fis.read(bytes);
			System.out.println(new String(bytes));
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
