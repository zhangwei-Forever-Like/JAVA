package day06;

import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		Game02 g=new Game02();
		g.setV(200);
		String n="abcd";
		String m="abcd";
		if(n=="abcd") {
			System.out.println("你是真的");
		}else {
			System.out.println("你是假的");
		}
	}

}

class Game02 {
	private int v;

	public void setV(int v) {
		if (this.v < v) {
			System.out.println("大了");
		} else if (this.v > v) {
			System.out.println("小了");
		} else {
			System.out.println("猜测成功");
		}
	}

	public int getV() {
		return v;
	}

}