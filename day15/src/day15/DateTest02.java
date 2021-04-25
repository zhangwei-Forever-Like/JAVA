package day15;

public class DateTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取当前时间从1970-01-01
		long nowTimeMillis=System.currentTimeMillis();
		long begin=System.currentTimeMillis();
		System.out.println(nowTimeMillis/365/1000/86400);
		print();
		long end=System.currentTimeMillis();
		System.out.println("耗费时长"+(end-begin)+"毫秒");
	}
public static void print() {
	for (int i = 0; i < 1000; i++) {
//		System.out.println("i="+i);
	}
}
}
