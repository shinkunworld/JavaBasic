package Static;

public class ThirdChild {


public void takeMoney(int money){
	
	PapaPouch.MONEY = PapaPouch.MONEY - money;
	if(PapaPouch.MONEY < 0) System.out.println("셋째는 돈이 없어 못 받았어요.ㅜㅜ");
	
}

}
