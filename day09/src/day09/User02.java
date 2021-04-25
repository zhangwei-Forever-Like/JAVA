package day09;

public class User02 {
public User02() {
	System.out.println("User's Default Constructor Invoke");
}

public User02(int i) {
	System.out.println("带有int类型参数的构造器");
}

public User02(String name) {
	System.out.println("带有String类型参数的构造器");
}

public User02(int i,String name) {
	System.out.println("带有int,String类型参数的构造器");
}
}
