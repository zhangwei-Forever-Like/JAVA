package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out = null;
		try {
			out = new FileWriter("file");
			char[] chars = {'我','是','中','国','人'};
			out.write(chars);
			out.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
