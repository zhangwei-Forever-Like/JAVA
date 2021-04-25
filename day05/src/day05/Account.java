package day05;

public class Account {
	private int id;
	private double balance;
	private double annua;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnua() {
		return annua;
	}

	public void setAnnua(double annua) {
		this.annua = annua;
	}

	public void withdraw(double withdraw) {
		if (this.balance < withdraw) {
			System.out.println("余额不足，取钱失败");
			return;
		}
		this.balance = this.balance - withdraw;
		System.out.println(withdraw);
	}

	public Account(int id, double balance, double annua) {
		super();
		this.id = id;
		this.balance = balance;
		this.annua = annua;
	}

	public Account() {
		super();
	}

	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
		System.out.println("成功存入：" + deposit);
	}

//	@Override
//	public String toString() {
//		return "Customer [" + name + "] has a account：id is " + id + ", balance=" + balance + ", annua=" + annua;
//	}
}
