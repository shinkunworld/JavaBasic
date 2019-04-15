package InputOutPut;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputClass {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\Bitnami\\jaout.txt");
			String str = "오늘 날씨는 아주 좋습니다.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
