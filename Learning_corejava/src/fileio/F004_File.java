package fileio;

import java.io.File;
import java.io.IOException;

public class F004_File {
	
	public static void main(String[] args) {
		
		
		File f = new File("D://files//tops.txt");
		
//		f.mkdir();
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
//		if(f.exists())
//		{
//			System.out.println("File is available.");
//			f.delete();
//		}
//		else
//		{
//			System.out.println("file not found");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
