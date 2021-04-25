import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		Scanner s = new Scanner(System.in);
		System.out.println("请你输入一个分数");
		int score = s.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("成绩为优");
		} else if (score >= 75) {
			System.out.println("成绩为良");
		} else if (score >= 60) {
			System.out.println("成绩为及格");
		} else if(score<60) {
			System.out.println("你的成绩为不及格");
		}
		else {
			System.out.println("抱歉，你输入的成绩无效");
		}
	}
	}

}
