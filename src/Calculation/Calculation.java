package Calculation;

public class Calculation {

	public static void main(String[] args) {
		int i = 10;
		
		int h = 5;
		System.out.println("삼항 연산자");
		int result = h != 5 ? 1 : 2;
		System.out.println(result);
		System.out.println("줄여 쓰는 연산자");
		i = i + 100;
		System.out.println("i=" + i);
		i = 11;
		System.out.println("i=" + i);
		i += 100; //i=100+i;
		System.out.println("i=" + i);
	}

}
