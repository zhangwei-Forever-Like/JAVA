package day10;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.name = "zhangsan";
		System.out.println(c1.name);
//		System.out.println(this.name);
		Customer c2 = new Customer();
		c2.name = "lisi";
		System.out.println(c2.name);
		c1.shopping();
		c2.shopping();
		Customer.doSome();
	
	}

}
