package bank;

import org.springframework.stereotype.Component;

@Component("retail")
public class RetailUser implements User {

	@Override
	public void personalInfo() {
		System.out.println("Retail user Info");
	}

}
