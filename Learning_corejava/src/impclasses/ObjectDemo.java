package impclasses;

class Test
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hello";
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t);
		System.out.println(t.getClass());
	}
}
