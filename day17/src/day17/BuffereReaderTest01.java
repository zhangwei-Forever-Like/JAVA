package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BuffereReaderTest01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("HashSetTest01.java");
		BufferedReader br = new BufferedReader(reader);
        String s=null;
        while((s=br.readLine())!=null) {
        	System.out.println(s);
        }
        br.close();
	}

}
