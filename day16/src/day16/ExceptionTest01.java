package day16;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
		System.out.println(nfe);
		NumberFormatException npe = new NumberFormatException("数字格式化异常！");
		System.out.println(npe);
	}

}
