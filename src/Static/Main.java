package Static;

public class Main {
public static void main(String[] args) {
	//static은 객체를 사용하지 않고 클래스에서 직접 공유가 가능하지만 많이쓰면 메모리에 과부하가 걸린다.
		
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
		System.out.println("PapaPouch.money : " + PapaPouch.MONEY);
		
	}
	
}
