package day15;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###.##");
		String s = df.format(1234.56);
		System.out.println(s);
		DecimalFormat df2 = new DecimalFormat("###,###.000");
		String s1 = df.format(12324.56);
		System.out.println(s1);
	}

}
