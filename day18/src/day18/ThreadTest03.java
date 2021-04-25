package day18;

public class ThreadTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable4 r = new MyRunnable4();
		Thread t = new Thread(r);
		t.setName("t");
		t.start();
		try {
			Thread.sleep(1000 * 5);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		r.run = false;
	}

}

class MyRunnable4 implements Runnable {
	boolean run = true;

	public void run() {
		for (int i = 0; i < 0; i++) {
			if (run) {
				System.out.println(Thread.currentThread().getName() + "--->" + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} else {
				return;
			}
		}
	}
}