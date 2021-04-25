package day05;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = { 's', 't', 'u', 'd', 'e', 'n', 't' };
		String s = new String(c, 2, 4);
		System.out.println(s);
		String str = "We are student";
		System.out.println(str.length());
		int size = str.indexOf("a");
		System.out.println(size);
		size = str.lastIndexOf("e");
		System.out.println(size);
		char mychar = str.charAt(8);
		System.out.println(mychar);
		String s2=str.substring(0,3);
		System.out.println(s2);
		String str2="  Java class  ";
		System.out.println(str2.length());
		String s3=str2.trim();
		System.out.println(s3.length());
		String newstr=str2.replace("J","j");
		System.out.println(newstr);
		System.out.println(str.equals(str2));
		String str3="We are student";
		System.out.println(str3.equals(str));
	}

}
