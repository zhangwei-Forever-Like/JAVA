package day16;

public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(100/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("算数异常了!!!!");
		}
		try {
			doSome();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void doSome() throws ClassNotFoundException {
//		int c=10/0;
		System.out.println("doSome!!!!!");
	}
}
