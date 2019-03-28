package Interface1;

public class InterfaceClass implements InterfaceEx1, InterfaceEx2 {

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("실제 구현은 여기서 해요1");
		return null;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제 구현은 여기서 해요2");
	}

}
