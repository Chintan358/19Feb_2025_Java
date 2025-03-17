package oops;

interface I1
{
	public static final int a = 10;
	public void dislay();
}

interface I2
{
	public void dislay();
}

class InterImpl implements I1,I2
{

	@Override
	public void dislay() {
		// TODO Auto-generated method stub
		System.out.println("Display calling");
	}
	
}


public class O013_InterfaceDemo {
	public static void main(String[] args) {
		
		InterImpl i = new InterImpl();
		i.dislay();
		
//		final int a = 10;
//		a = 20;
//		System.out.println(a);
	}
}
