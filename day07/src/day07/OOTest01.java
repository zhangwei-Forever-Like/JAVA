package day07;

public class OOTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student();
     s.age = 18;
     s.address = "江西省南昌市";
     s.name = "  ";
     s.no = 1;
     s.sex=true;
     s.no = 2;
     System.out.println("年龄为："+s.age);
     System.out.println("地址为："+s.address);
     System.out.println("姓名为："+s.name);
     System.out.println("学号为："+s.no);
     System.out.println("性别为："+s.sex);
     Student stu = new Student();
     stu.name = "握手";
     System.out.println(stu.name);
     s.addr = new Address();
     System.out.println(s.addr.address);
 
	}

}
