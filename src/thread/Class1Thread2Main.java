package thread;

public class Class1Thread2Main {
	public static void main(String[] args) {

		Class1Thread2Class threadTest = new Class1Thread2Class();

		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "서울");
		thread0.start();
		thread1.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}
