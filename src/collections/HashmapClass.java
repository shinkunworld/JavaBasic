package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashmapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		System.out.println("여기서 Integer는 key,String은 데이터형식이다");
		System.out.println("hashmap은 중복 불가");
		hashmap.put(0, "str0");
		hashmap.put(10, "str1");
		hashmap.put(5, "str2");
		hashmap.put(20, "str3");
		System.out.println(hashmap);

		String str = hashmap.get(5);
		System.out.println(str);

		Iterator<Integer> iterator = hashmap.keySet().iterator();

		while (iterator.hasNext()) {
			String string = hashmap.get(iterator.next());
			System.out.println(string);

		}

		hashmap.remove(5);
		System.out.println(hashmap);

		hashmap.clear();
		System.out.println(hashmap);

	}

}
