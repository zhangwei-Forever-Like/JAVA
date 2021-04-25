package day12;

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMathImol m=new MyMathImol();
		System.out.println(m.sum(99, 2));
		System.out.println(m.sub(100, 1));
		MyMath m2=new MyMathImol();
		System.out.println(m2.sum(88, 11));
	}

}
interface MyMath{
	double PI=3.1415926;
	int sum(int a,int b);
	int sub(int a,int b);
}
class MyMathImol implements MyMath {
   public int sum(int a,int b) {
	   return a+b;
	}
   public int sub(int a,int b) {
		return a-b;
   }
 }