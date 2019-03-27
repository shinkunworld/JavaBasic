package abstract2;

public class Main {

	public static void main(String[] args) {

		LunchMenu child1 = new Child1(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);
		LunchMenu child2 = new Child2(Price.RICE, Price.BULGOGI, Price.BANANA, Price.MILK, Price.ALMOND);

		System.out.println("child1 아이의 식대 : " + child1.calculating());
		System.out.println("child2 아이의 식대 : " + child2.calculating());

	}
}
