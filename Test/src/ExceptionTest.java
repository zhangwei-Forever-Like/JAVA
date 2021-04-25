
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyException e = new MyException("用户名不能为空！");
		e.printStackTrace();
		
		String msg=e.getMessage();
		System.out.println(msg);
	}

}
