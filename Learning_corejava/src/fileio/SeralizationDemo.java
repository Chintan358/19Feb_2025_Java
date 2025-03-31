package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeralizationDemo {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		
		try {
			FileOutputStream fos = new FileOutputStream("D://files//demo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(st);
			
			System.out.println("done");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
