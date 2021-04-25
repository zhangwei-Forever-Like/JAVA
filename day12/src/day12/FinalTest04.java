package day12;

public class FinalTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese c = new Chinese();
		System.out.println(Chinese.country);
		c.idCard = "银行卡";
		System.out.println(c.idCard);
	}

}

class Chinese {
	String idCard;
	String name;
	static final String country = "中国";
}

abstract class Account {
	public abstract void A();
}

abstract class CreditAccount extends Account {
    public abstract void B();
}