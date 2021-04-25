package day11;

public class FinalTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chinese c = new Chinese();
System.out.println(Chinese.country);
System.out.println(Math.PI);
	}

}
class Chinese{

 public static final String country="中国";  
}
class Math{
	public static final double PI = 3.1415926;
}