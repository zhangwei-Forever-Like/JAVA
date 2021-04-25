package day09;

public class ConstructorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account act1 = new Account();
		System.out.println("账号：" + act1.getActno());
		System.out.println("余额：" + act1.getBalance());
		Account act2 = new Account(100);
		System.out.println("账号：" + act2.getActno());
		System.out.println("余额：" + act2.getBalance());
		Account act3 = new Account(10.0);
		System.out.println("账号：" + act3.getActno());
		System.out.println("余额：" + act3.getBalance());
		Account act4 = new Account("200",20.2);
		System.out.println("账号：" + act4.getActno());
		System.out.println("余额：" + act4.getBalance());
	}

}
