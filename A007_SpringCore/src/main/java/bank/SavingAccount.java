package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Account {

//	RetailUser user = new RetailUser();
	@Autowired
	@Qualifier("retail")
	User user;
	
	@Override
	public void getDetails() {
		
		System.out.println("Saving account...");
		user.personalInfo();
	}

}
