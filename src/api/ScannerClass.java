package api;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str1 = scanner.next();
		System.out.println(str1);

		String str2 = scanner.nextLine(); //nextLine의 경우 enter를 입력 받아 종료
		System.out.println(str2);
		System.out.println("end");
	}

}
