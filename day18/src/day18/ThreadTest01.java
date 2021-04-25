package day18;

public class ThreadTest01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Thread.sleep(1000 * 5);
//		System.out.println("你是什么");
		Thread t = new MyThread3();
		t.setName("t");
		t.start();
		try {
			t.sleep(1000 * 5);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("hello world");
	}

}

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}