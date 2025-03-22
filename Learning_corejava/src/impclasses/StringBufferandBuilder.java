package impclasses;

public class StringBufferandBuilder {
	public static void main(String[] args) {
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=0;i<=1000000;i++)
		{
			sb.append("Java");
		}
		double endTime = System.currentTimeMillis();
		
		
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=0;i<=1000000;i++)
		{
			sb1.append("Java");
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("Time taken by buffer : "+(endTime-startTime));
		System.out.println("Time taken by builder : "+(endTime1-startTime1));
		
		
	}
}