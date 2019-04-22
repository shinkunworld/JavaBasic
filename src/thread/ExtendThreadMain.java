package thread;

public class ExtendThreadMain {

	public static void main(String[] args) {

		ExtendThreadClass threadTest = new ExtendThreadClass();
		threadTest.setName("b");
		threadTest.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}
