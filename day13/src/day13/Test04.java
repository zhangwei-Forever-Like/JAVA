package day13;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime t1 = new MyTime(1970, 1, 1);
		String s1 = t1.toString();
		System.out.println(s1);
	}

	
}

class MyTime {
	int year;
	int month;
	int day;

	public MyTime() {

	}

	public MyTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String toString() {
		return this.year + "年" + this.month + "月" + this.day + "日";
	}
}
