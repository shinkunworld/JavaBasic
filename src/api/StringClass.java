package api;

public class StringClass {

	public static void main(String[] args) {
	String str1="abcd";
	String str2="efgh";
	String str3="ijkl";
	
	System.out.println(str1.concat(str2));
	System.out.println(str1.substring(2));
	System.out.println(str1.length());
	System.out.println(str1.toUpperCase());//대문자
	System.out.println(str2.toLowerCase());//소문자
	System.out.println(str1.charAt(3)); //index[3]찾기
	System.out.println(str1.indexOf('c'));//index위치찾기
	
	String str4="xyz";
	System.out.println(str1.contentEquals(str4));
	
	String str5=" abc def ghi ";
	System.out.println(str5.trim()); //가장 자리에있는 공백정리
	
	System.out.println(str1.replace('a','Z'));//글자 바꾸기
	System.out.println(str1.replaceAll("abcd","ZZZ"));//글자 전체 바꾸기
	System.out.println(str1);
	
	//객체일때 Stringbuilder은 StringBuffer도 동일하다
	StringBuilder stringbuilder=new StringBuilder("abcdefghijk");
	stringbuilder.append("zzzz"); //맨끝에 넣기
	System.out.println(stringbuilder);
	stringbuilder.insert(3,"iiiiiii");//3번째에넣기
	System.out.println(stringbuilder);
	stringbuilder.delete(3, 7);
	System.out.println(stringbuilder);
	stringbuilder.deleteCharAt(10);//10번째 삭제
	System.out.println(stringbuilder);
	}

}
