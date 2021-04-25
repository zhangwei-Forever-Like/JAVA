package day05;

public class Prime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
			for (int i = 2; i <= 10000; i++) {
				boolean flag = true;
				if (i == 2) {
					flag = false;
				}
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					t++;
					System.out.print(i + " ");
					if(t%8==0) {
						System.out.println();
					}
				}
			}
	}
}
