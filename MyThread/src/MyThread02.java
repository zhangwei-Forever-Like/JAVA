
public class MyThread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("主线程-->"+i);
		}
	}

}
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}