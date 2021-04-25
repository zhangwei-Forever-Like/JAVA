package day05;

public class Customer {
	private String name;
	private Account act;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAct() {
		return act;
	}

	public Customer(String name, Account act) {
		super();
		this.name = name;
		this.act = act;
	}

	public Customer() {
		super();
	}

	public void setAct(Account act) {
		this.act = act;
	}

}
