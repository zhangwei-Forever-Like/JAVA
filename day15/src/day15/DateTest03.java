package day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date time = new Date(1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime = sdf.format(time);
		System.out.println(strTime);
		
		Date time2=new Date(System.currentTimeMillis()-1000*24*60*60);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		String strTime2=sdf3.format(time2);
		System.out.println(strTime2);
	}

}
