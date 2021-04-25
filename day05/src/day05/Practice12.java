package day05;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		for(int i=1;i<=54;i++) {
			for(int j=1;j<=54;j++) {
				if(i+j+i*j==54) {
					 x=i;
					 y=j;
				}
			}
		}
		int m=x+y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x+y="+m);
	}

}
