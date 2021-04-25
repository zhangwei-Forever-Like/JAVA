package day18;

public class ThreadTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable3());
		t.setName("t");
		t.start();
		try {
			Thread.sleep(1000 * 5);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		t.stop();
	}

}

class MyRunnable3 implements Runnable {
	public void run() {
		for (int i = 0; i < 0; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}