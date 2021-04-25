
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setSno(1);
		stu.setSname("张三");
		System.out.println("你的学号为：" + stu.getSno());
		System.out.println("你的姓名为：" + stu.getSname());
		Student1 stu1=new Student1(1,"张三","专业名字");
		System.out.println(stu1.toString());
	}

}

class Student {
	private int sno;
	private String sname;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}



	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


}
class Student1 extends Student{
	private String dept;
	private int sno;
	private String sname;

	public Student1() {
		
	}

	public Student1(int sno,String sname,String dept) {
	
		this.dept = dept;
		this.sname=sname;
		this.sno=sno;
	}

	@Override
	public String toString() {
		return "Student1 [dept=" + dept + ", sno=" + sno + ", sname=" + sname + "]";
	}
	
}