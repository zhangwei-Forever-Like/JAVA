package day13;

public class Student {
	public static void main(String[] args) {
		Student s1=new Student(111,"江西南昌");
		Student s2=new Student(111,"江西南昌");
//		String  s3=new s1.toString();
		User02 u=new User02();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(u.weight));
	}
	int no;

	public Student(int no, String school) {
		super();
		this.no = no;
		this.school = school;
	}

	String school;

	public Student() {
		super();
	}

	public String toString() {
		return "学号" + no + ",所在学校名称" + school;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Student))
			return false;
		if (this == obj)
			return true;
		Student s = (Student) obj;
		if (this.no == s.no && this.school.equals(s.school)) {
			return true;
		}
		return false;
	}

}

