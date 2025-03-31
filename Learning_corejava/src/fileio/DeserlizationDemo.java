package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserlizationDemo {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("D://files//demo.ser");
			ObjectInputStream os = new ObjectInputStream(fis);
			
			Student st =   (Student) os.readObject();
			st.display();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
