package day05;

import java.util.Date;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("b");
		String str2 = new String("a");
		String str3 = new String("c");
		System.out.println(str1.compareTo(str2));
		System.out.println(str3.compareTo(str2));
		
		String str="192.168.0.1";
		String[] firstArray=str.split("\\.");
		for(String a:firstArray) {
			System.out.println(a);
		}
		Date date=new Date();
		String s=String.format("%te", date);
		System.out.println(s);
		String s2=String.format("%tF",date);
		System.out.println(s2);
	}

}
