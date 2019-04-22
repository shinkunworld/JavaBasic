package thread;

public class RunnableThreadMain {

	public static void main(String[] args) {

		RunnableThreadClass threadTest = new RunnableThreadClass();
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		//main thread가 먼저 실행된다.

	}

}
