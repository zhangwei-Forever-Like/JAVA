package day05;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(1000, 2000, 1.23);
		Customer c = new Customer("Jane Smith", a);
		a.deposit(100);
		a.withdraw(960);
		a.withdraw(2000);
		c.getAct().deposit(100);
		c.getAct().withdraw(960);
		c.getAct().withdraw(2000);
		c.getAct().deposit(100);
		c.getAct().withdraw(960);
		c.getAct().withdraw(2000);
//		System.out.println(a);
//		Student s=new Student();
//		System.out.println(s.getName()+","+s.getPostAddress());
	}

}
