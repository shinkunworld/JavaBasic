package collections;

import java.util.HashSet;

public class HashsetMain {

	public static void main(String[] args) {

		HashSet<HashsetClass> hashset = new HashSet<HashsetClass>();
		hashset.add(new HashsetClass("kim", 4));
		hashset.add(new HashsetClass("shin", 6));
		hashset.add(new HashsetClass("kang", 1));
		
		System.out.println(hashset);
		
		System.out.println("");
		System.out.println("객체를 생성하면 주소값이 다름 두개의 객체가 생겨 삭제가안됨 오버라이드 해야함");
		HashsetClass hash = new HashsetClass("shin",6);
		hashset.remove(hash);
		System.out.println(hashset);
	}

}
