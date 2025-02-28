package statements;

public class S002_SwitchcaseDemo {
	public static void main(String[] args) {

		int choice = 4;

		switch (choice) {
		case 1:
			System.out.println("Gujarati");
			break;
		case 2:
			System.out.println("Hindi");
			break;
		case 3:
			System.out.println("English");
			break;
		default:
			System.out.println("Invalid input");
		}

	}
}
