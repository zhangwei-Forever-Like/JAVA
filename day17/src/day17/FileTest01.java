package day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;



public class FileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("F:\\da");
		System.out.println(f1.exists());
		if(!f1.exists()) {
			f1.mkdir();
		}
		System.out.println("文件名："+f1.getName());
		System.out.println(f1.isDirectory());
		long haoMiao=f1.lastModified();
		Date time = new Date(haoMiao);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime =sdf.format(time);
		System.out.println(strTime);
		System.out.println(f1.length());
	}

}
