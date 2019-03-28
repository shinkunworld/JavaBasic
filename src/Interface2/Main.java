package Interface2;

public class Main {
	public static void main(String[] args) {

//		APhone aPhone = new APhone();
//		BPhone bPhone = new BPhone();
//		CPhone cPhone = new CPhone();

		IFunction aPhone = new Aphone();
		IFunction bPhone = new Bphone();
		IFunction cPhone = new Cphone();

		IFunction[] iFunctions = { aPhone, bPhone, cPhone };

		for (int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("======================================");
		}

	}
}
