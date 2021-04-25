package day10;

public class Customer {
	String name;
	public Customer() {
		
	}
	public void shopping() {
		System.out.println(name+"在购物!");
	}
	public static void doSome() {
		Customer c1 =new Customer();
		System.out.print(c1.name);
	}
}
