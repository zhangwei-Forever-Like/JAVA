
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * 55+1);
//			System.out.println(number);
			sum++;
			if (number ==6) {
				count++;
			}
		}
		System.out.println("测试总次数："+sum);
		System.out.println("六号的次数："+count);
		
	}

}
