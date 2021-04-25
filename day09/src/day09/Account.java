package day09;

public class Account {
	private String actno;

	public Account() {

	}

	public Account(String s) {
		actno = s;
	}

	public Account(double d) {
		balance = d;
	}

	public Account(String s, double d) {
		actno = s;
		balance = d;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private double balance;
}
