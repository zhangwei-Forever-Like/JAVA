package day14;

import java.util.Scanner;

public class HotelMgtSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用酒店管理系统，请认真阅读一下使用说明");
		System.out.println("请输入对应的功能编号：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出来");
		Hotel hotel = new Hotel();
//		hotel.print();
		Scanner s = new Scanner(System.in);
		System.out.println("请你输入编号：");
		
		while (true) {
			int i = s.nextInt();
			if (i == 1) {
				hotel.print();
			} else if (i == 2) {
				System.out.print("请输入订房编号：");
				int roomNo = s.nextInt();
				hotel.order(roomNo);
			} else if (i == 3) {
				System.out.print("请你输入退房编号：");
				int roomNo = s.nextInt();
				hotel.exit(roomNo);
			} else if (i == 0) {
				System.out.println("再见，欢迎下次再来");
			} else {
				System.out.println("输入功能编号有误，请重新输入!");
			}
		}
	}

}
