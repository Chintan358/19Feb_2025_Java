package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Account {

	@Autowired
	@Qualifier("corporate")
	User user;
	@Override
	public void getDetails() {
		
		System.out.println("Loan account...");
		user.personalInfo();
	}

}
