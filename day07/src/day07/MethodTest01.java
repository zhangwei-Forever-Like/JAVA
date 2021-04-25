package day07;

public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a =10;
   int b=20;
   int retValue = sumInt(a,b);
   System.out.println("retValue="+retValue);
	}
public static int sumInt(int i,int j) {
	int result = i+j;
	int num =3;
	int retValue = divide(result,num);
	return retValue;
}
public static int divide(int x,int y) {
	int z = x / y;
	return z;
}
}
