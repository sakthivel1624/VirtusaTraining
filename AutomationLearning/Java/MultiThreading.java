 
package MultiThread;

public class MultiThreadingDemo extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("hii");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

package MultiThread;

public class MultiThreadingDemo2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package MultiThread;

public class ThreadDriver {

	public static void main(String[] args) {
		MultiThreadingDemo object = new MultiThreadingDemo();
		MultiThreadingDemo2 object2 = new MultiThreadingDemo2();
		object.start();
		object2.start();
	}
}
