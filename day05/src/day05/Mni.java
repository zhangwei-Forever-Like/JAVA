package day05;

import java.util.Scanner;

public class Mni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入用户名");
		Scanner s1 = new Scanner(System.in);
		String username = s1.next();
		System.out.println("请输入密码");
		Scanner s2 = new Scanner(System.in);
		String password = s1.next();
		user(username,password);
	}

	public static void user(String a, String b) {
		String d="admin";
		if (a.equals("admin")&&b.equals("123")) {
			System.out.println("欢迎进入本系统");
		}
		else {
			System.out.println("打印错误，并退出系统");
		}
	}
}
