package day09;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c =new Customer();
c.setAge(100);
c.setName("张三丰");
c.setId(10);
c.setAddr("江西南昌");

System.out.println(c.getId());
System.out.println(c.getName());
System.out.println(c.getAge());
System.out.println(c.getAddr());
	}

}
