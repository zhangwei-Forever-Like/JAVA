package day10;

public class ExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditAccount act = new CreditAccount();
		act.setCredit(0.99);
		act.setBalance(-1000.0);
		act.setActno("act-001");

		System.out.println(act.getActno() + "," + act.getBalance() + "," + act.getCredit());
	}

}
