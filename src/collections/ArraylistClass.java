package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistClass {

	public static void main(String[] args) {

		//ArrayList와LinkedList는 거의 비슷하다
		// index가 가장 중요하다
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		System.out.println(arrayList);
		// System.out.println(arrayList.toString());

		System.out.print("\n 1.index를 통한 조회");
		String index3 = arrayList.get(3);
		System.out.println("index3=" + index3);

		System.out.println("\n 2.Iterator 통한 전체 조회");

		Iterator<String> array = arrayList.iterator();

		while (array.hasNext()) {

			System.out.println(array.next());

		}

		System.out.println("\n 3.for을 통한 전체 조회\"");
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i) + ",");

		}

		System.out.println("\n 4. New for-loop 통한 전체 조회");

		for (Object object : arrayList) {

			System.out.println(object);

		}

		arrayList.set(2, "str2222222");
		System.out.println(arrayList);

		int size = arrayList.size();
		System.out.println("size:" + size);

		arrayList.remove(2);
		System.out.println(arrayList);

		arrayList.clear();
		System.out.println(arrayList);

		arrayList = null;
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		

	}

}
