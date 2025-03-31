package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutputStream {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("D:\\File\\home.txt");
			
			String str = "Hello java, Hello python 123";
			byte b[] = str.getBytes();
			
			fos.write(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			System.out.println(e);
		}
		finally
		{
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
