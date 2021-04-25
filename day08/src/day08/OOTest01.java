package day08;

public class OOTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		System.out.println(c.id);
//		c = null;
//		System.out.println(c.id);
		String expression="wo like Chinese";
		int index=0;
		char m=expression.substring(index, index+2).charAt(0);
		System.out.println(m);
	}

}
