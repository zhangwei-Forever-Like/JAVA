package day06;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] a=new int[5];
		int index=0;
		while(index<5) {
			int num=r.nextInt(6);
			if(m(a,num)) {
				a[index]=num;
				index++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static boolean m(int[] a,int num) {
        for(int i=0;i<a.length;i++) {
        	if(num==a[i]) {
        		return false;
        	}
        }
        return true;
	}

}
