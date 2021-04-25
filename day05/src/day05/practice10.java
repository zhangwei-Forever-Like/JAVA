package day05;

import java.text.DecimalFormat;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		while (i <= 6) {
			int n = (int) (Math.random() * 30) + 1;
			if (n % 2 == 0) {
				sum += n;
				i++;
				System.out.println(n);
			}
		}
		System.out.println(sum);
		System.out.printf("%.5f\n",area(3));
		SimgleFormat("0.000,00",area(3));
	}

	public static double area(double R) {
		double area;
		area = Math.pow(R, R) * Math.PI;
		return area;
	}
	public static void SimgleFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat();
		String output=myFormat.format(value);
		System.out.println(value);
	}
}
