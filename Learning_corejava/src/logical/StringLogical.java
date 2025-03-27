package logical;

public class StringLogical {
	public static void main(String[] args) {
		
		String str = "Hello hava 123";
		
		int charCount = 0;
		int digitCount = 0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digitCount++;
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				charCount++;
			}
		}
		
		System.out.println("Chars : "+charCount);
		System.out.println("numbers : "+digitCount);
		
	}
}
