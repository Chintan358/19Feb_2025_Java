package impclasses;

public class StringPracticals {
	public static void main(String[] args) {
		
		
		String str = "Sun rises in east";
		
		//east in rises sun
		//tsae ni sesir nus
		//nus sesir ni tsae
		//east rises in sun
		
		String words[] = str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		System.out.println("*******************");
		
		char ch[] = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("*******************");
		
		for(int i=0;i<words.length;i++)
		{
			char c[] = words[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("*******************");
		
		String temp = words[0];
		words[0] = words[words.length-1];
		words[words.length-1] = temp;
		
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]+" ");
		}
		
		
	
	}
}
