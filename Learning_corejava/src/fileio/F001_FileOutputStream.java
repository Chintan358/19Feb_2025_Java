package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutputStream {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			
			fos = new F

				"D:\\Files\\home.txt");
			String s = "This is my firs tio program";
			byte b[] = s.getBytes();
			
			fos.write(b);
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
