package day12;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodMenu cooker1 = new Chinese01();
		Customer customer = new Customer(cooker1);
		customer.order();
	}

}
