package day13;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		int hashCodeValue = o.hashCode();
		System.out.println(hashCodeValue);
		MyClass mc = new MyClass();
		int hashCodeValue2 = mc.hashCode();
		System.out.println(hashCodeValue2);
		MyClass mc1 = new MyClass();
		int hashCodeValue3 = mc1.hashCode();
		System.out.println(hashCodeValue3);
	}

}

class MyClass {

}