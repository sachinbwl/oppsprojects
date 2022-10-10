package OOPS;

public abstract class Hyundaicars implements Car{
	//by using abstract class we are bonding Hyundaicars to satisfy one or more conditions of Car only.
	//in abstract class object can not be created and function can be override in other class 
	public static void main(String[] args) {
		
		

	}

	@Override
	public void start() {
		System.out.println("Start");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop");
		
	}

	@Override
	public void accel() {
		System.out.println("Accel");
		
	}



}
