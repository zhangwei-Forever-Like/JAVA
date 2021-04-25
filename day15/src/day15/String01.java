package day15;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = "中国人".charAt(1);
		System.out.println(c);
		//比较字符串，第一个字母和后面字符串的第一个字母比较
		int result="abc".compareTo("abc");
		System.out.println(result);
		int result2 ="abcd".compareTo("abce");
		System.out.println(result2);
		int result3="abce".compareTo("abcd");
		System.out.println(result3);
		
		//判断前面的字符串中是否包含后面的子字符串
		System.out.println("HelloWorld.java".contains(".java"));
		 
		//判断当前字符串是否以某个字符串结尾
		System.out.println("test.txt".endsWith(".java"));
		System.out.println("test.txt".endsWith(".txt"));
		System.out.println("fdsajkafafasss".endsWith("ss"));
		
		System.out.println("ABc".equalsIgnoreCase("abC"));
		
		System.out.println("dahdakjava".indexOf("java"));
		
		//isEmpty()
		String s="a";
		System.out.println(s.isEmpty());
		
		//length()
		System.out.println("abc".length());
		System.out.println("".length());
		
		//lastIndexOf()
		System.out.println("abdgajdgagjdjava".lastIndexOf("java"));
		
		//replace
		String newString ="http://www.baidu.com".replace("http://", "https://");
		System.out.println(newString);
		
		//split拆分字符串
		String[] ymd="1980-10-11".split("-");
		for(int i=0;i<ymd.length;i++) {
			System.out.println(ymd[i]);
		}
		
			//startWith判断某个字符串是否以某个字符串开始
			System.out.println("http://www.baidu.com".startsWith("http"));
			System.out.println("http://www.baidu.com".startsWith("https"));
			
			//substring 参数是起始下标
			System.out.println("http://www.baidu.com".substring(7));
			//beginIndex起始位置（包括）
			//endIndex结束位置（不包括）
			System.out.println("http://www.baidu.com".substring(7,10));
			
			//char[]将字符串转换成char数组
			char[] chars="我是中国人".toCharArray();
			for(int i=0;i<chars.length;i++) {
				System.out.println(chars[i]);
			}
			
			//toLowerCase()转换为小写
			System.out.println("ABCDefgXyz".toLowerCase());
		     
			//toUpperCase()
			System.out.println("ABCDefgXyz".toUpperCase());
			
			//trim()去除字符串前后空白
			System.out.println("  hellow   world    ");
			
			
	}

}
