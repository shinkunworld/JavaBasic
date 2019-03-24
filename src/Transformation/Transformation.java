package Transformation;

import java.util.Scanner;

public class Transformation {

	public static void main(String[] args) {

		int i1 = 10;
		double d1 = i1;
		System.out.println("d1데이터는" + d1 + "입니다.");
		double d2 = 10.5D;
		int i2 = (int) d2;// 형변환 data 8byte를 4byte로 넣기로 위함
		// int형으로 변환하여 소수점은 짤린다.
		System.out.println("i2데이터는" + i2 + "입니다.");

		
		
		
		// 입력:키보드로 두수의 입력을 받는다.
		// 출력:화면에 두수의 합을 출력한다.
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("숫자를 하나씩 두번 입력해주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		// String s1,s2를 integer.parseInt로 사용하여 int형으로 형변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		System.out.printf("%d와%d의합은%d입니다.", a, b, a + b);
		scanner.close();
	}

}
