package InputOutPut;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataIOClass {

	public static void main(String[] args) {
		InputStream is =null;
		DataInputStream dis =null;
		
		OutputStream os =null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("C:\\Bitnami\\str.txt");
			dis=new DataInputStream(is);
			String str= dis.readUTF();
			
			os=new FileOutputStream("C:\\Bitnami\\str_copy.txt");
			dos=new DataOutputStream(os);		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (dos !=null) {
				try {
					dos.close();
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
