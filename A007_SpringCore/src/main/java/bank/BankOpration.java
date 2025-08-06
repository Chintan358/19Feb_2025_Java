package bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankOpration {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext cx  =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Account sv = cx.getBean("saving",Account.class);
		Account ln = cx.getBean("loanAccount",Account.class);
		
		sv.getDetails();
		ln.getDetails();
		
		
		
	}
}	
