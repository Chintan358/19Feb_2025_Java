

class vehicle
{
	
}

class Car  extends vehicle
{
	
}



public class Demo1 {
	public static void main(String[] args) {
		
			
		//vehicle v  =new Car(); //upcasting
		//
		Car c  =(Car) new  vehicle(); //downcasting
		
		System.out.println(new Car() instanceof vehicle);
		System.out.println(new vehicle() instanceof Car);
		
	}
}
