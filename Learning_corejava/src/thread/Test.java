package thread;

public class Test {
	public static void main(String[] args) {
		
		Maths m = new Maths();
		
		double startTime = System.currentTimeMillis();
		for(int i=1;i<=1000;i++)
		{
			m.table(10);
		}
		
		double endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		
		
	}
}
