package day16;

public class EnumTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r = divide(10, 0);
		System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
	}

	public static Result divide(int a, int b) {
		try {
			int c = a / b;
			return Result.SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return Result.FAIL;
		}
	}
}

enum Result {
	SUCCESS, FAIL
}