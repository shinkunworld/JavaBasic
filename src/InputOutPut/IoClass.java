package InputOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoClass {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Bitnami\\jain.txt");
			os = new FileOutputStream("C:\\Bitnami\\jaout.txt");

			byte[] bs = new byte[5];
			while (true) {
				int count = is.read(bs);
				if (count == -1) {
					break;}
			
			os.write(bs, 0, count);}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			if(is!=null) {
				try {
					is.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if(os!=null) {
				try {
					os.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
}
