package day06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String startTime1 = s1.format(d1);
		System.out.println(startTime1);
		Date d2 = new Date();
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String startTime2 = s2.format(d2);
		System.out.println(startTime2);
	}

}
