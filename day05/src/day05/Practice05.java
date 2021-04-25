package day05;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "We Are Students";
		String str2="we are student";
		String str3="I love learning Java";
		String low = str1.toLowerCase();
		System.out.println(low);
		String upper = str1.toUpperCase();
		System.out.println(upper);
	    
		String new1=str1.substring(0,6);
		System.out.println(new1);
		String new2=str2.substring(0,6);
		System.out.println(new2);
		String new3=str3.substring(0,6);
		if(new1.equalsIgnoreCase(new2)) {
			System.out.println("两个字串相同");
		}else {
			System.out.println("两个字串不相同");
		}
		StringBuilder builder=new StringBuilder();
		for(int i=1;i<=10;i++) {
			builder.append(i);
		}
		System.out.println(builder);
	}

}
