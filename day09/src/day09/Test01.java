package day09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		add(i);
		System.out.println("main -->" + i);
	}

	public static void add(int i) {
		i++;
		System.out.println("add -->" + i);
	}
}
