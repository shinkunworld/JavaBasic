package api;

public class WrapperClass {

	public static void main(String[] args) {
		// Wrapper클래스는 기초데이터를 object를 객체데이터로 변환시키는 클래스이다.
		Integer integer = new Integer(10);
		int i =integer.intValue();
		System.out.println(i+10);
	}

}
