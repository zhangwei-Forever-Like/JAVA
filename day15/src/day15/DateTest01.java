package day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		String s = sdf.format(d);
		System.out.println(s);

		String time = "2019-10-01 10:10:10 666";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		Date dateTime = sdf2.parse(time);
		System.out.println(dateTime);
	}

}
