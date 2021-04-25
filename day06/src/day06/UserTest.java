package day06;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
		System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出系统");
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.print("请输入功能编号：");
			int i = s.nextInt();
			if (i == 1) {
				a.print();
			} else if (i == 2) {
				System.out.println("请您输入需要订房的编号");
				int id = s.nextInt();
				a.order(id);
			} else if (i == 3) {
				System.out.println("请您输入需要退房的编号");
				int id = s.nextInt();
				a.exit(id);
			} else if (i == 0) {
				return;
			} else {
				System.out.println("你可能打错了功能编号");
			}
		}
	}

}
