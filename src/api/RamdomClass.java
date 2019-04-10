package api;
import java.util.Random;
public class RamdomClass {

	public static void main(String[] args) {
	double d= Math.random();//Math.random 데이터형은 double
	System.out.println(d);
	
	int dd = (int)(d*10);
	System.out.println(dd);
	
	Random random =new Random();
	int i=random.nextInt(100);//100까지 랜덤 발생
	System.out.println(i);
	
	}

}
