package day13;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 100;
		System.out.println(a == b);
		MyTime02 t1 = new MyTime02(2008, 8, 8);
		MyTime02 t2 = new MyTime02(2008, 8, 8);
		MyTime02 t3 = new MyTime02(2008, 9 ,9);
		System.out.println(t1 == t2);
		boolean flag = t1.equals(t2);
		System.out.println(flag);
		boolean flag2 = t1.equals(t3);
		System.out.println(flag2);
	}

}

class MyTime02 {
	int year;
	int month;
	int day;

	public MyTime02() {

	}

	public MyTime02(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean equals(Object obj) {
		int year1 = this.year;
		int month1 = this.month;
		int day1 = this.day;
		if (obj instanceof MyTime02) {
			MyTime02 t = (MyTime02) obj;
			int year2 = t.year;
			int month2 = t.month;
			int day2 = t.day;
			if (year1 == year2 && month1 == month2 && day1 == day2) {
				return true;
			}
		}
		return false;
	}
}
