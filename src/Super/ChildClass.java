package Super;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		//초기 생성자의 경우 부모의 생성자가 먼저 실행되고 자식의 생성자가 실행 된다.
		System.out.println("ChildClass");
		
	}
	
	@Override
	public void method1() {
		System.out.println("부모 클래스의 method()를 실행 하고, 자식 클래스의 나머지 작업을 합니다.");
		super.method1();
		//super를 사용하면 오버라이드를 하더라도 부모의 메소드를 사용가능.
	}
	}

