package day15;

public class IntegerTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String-->int
		int i1 = Integer.parseInt("100");
		System.out.println(i1 + 1);
		
		// int-->String
		String s2 = i1 + "";
		System.out.println(s2 + 1);
		
		// int-->Integer
		Integer x = 1000;
		
		//Integer -->int
		int y=x;
		System.out.println(y);
		
		//String -->Integer
		Integer k=Integer.valueOf("123");
		
		//Integer -->String
		String  e=String.valueOf(k);
		System.out.println(e);
	}

}
