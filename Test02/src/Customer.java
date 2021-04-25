
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("顾客要购BMW:");
		Car bmw = CarFactory.getCar("BMW");
		System.out.println("提取汽车：" + bmw.getlnfo());
		System.out.println("顾客要购买Benz");
		Car benz = CarFactory.getCar("Benz");
		System.out.println("提取汽车：" + benz.getlnfo());
	}

}
