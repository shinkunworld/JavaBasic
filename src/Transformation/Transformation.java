package Transformation;

public class Transformation {

	public static void main(String[] args) {
		
		int i1 = 10;
		double d1 = i1;
		System.out.println("d1데이터는" + d1 + "입니다.");
		double d2 = 10.5D;
		int i2 = (int) d2;// 형변환 data 8byte를 4byte로 넣기로 위함
		System.out.println("i2데이터는" + i2 + "입니다.");

	}

}
