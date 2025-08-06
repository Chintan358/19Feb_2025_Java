package bank;

import org.springframework.stereotype.Component;

@Component("corporate")
public class CorporateUser implements User {

	@Override
	public void personalInfo() {
		
		System.out.println("Corporate user");
		
	}

}
