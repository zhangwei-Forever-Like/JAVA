package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BuffereReaderTest02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("myfile");
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		String line =null;
		while((line =br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}

}
