package day17;

import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\en");
		if (!f.exists()) {
			f.mkdir();
		}
		File[] files = f.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}

	}

}
