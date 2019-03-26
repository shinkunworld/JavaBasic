package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		// method.1
		int[] iarry = { 1, 2, 3, 4 };
		System.out.println(iarry[3]);
		// method.2

		int[] jarray = new int[3];
		jarray[0] = 1;
		jarray[2] = 2;
		jarray[1] = 3;

		System.out.println(jarray[1]);

		String[] iArrName = { "영희", "철수", "길동", "영수", "말자" };
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;

		int minH = 0;
		int minHIndex = 0;

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArrName[i] + "키를 입력 하세요. : ");
			iArr[i] = scanner.nextInt();
			totalHeight = totalHeight + iArr[i];
		}

		System.out.println("학생들의 평균 신장은 " + (totalHeight / iArrName.length) + "입니다.");

		for (int i = 0; i < iArr.length; i++) {

			if (iArr[i] > maxH) {
				// maxH = iArr[i];

				// maxHIndex = i;
			}
		}
		System.out.println("가장 큰 학생은 " + iArrName[maxHIndex] + "입니다.");

		minH = maxH;
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] < minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + iArrName[minHIndex] + "입니다.");

	}

}
