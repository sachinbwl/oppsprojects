package OOPS;

public class BMWcar extends Hyundaicars{

	public static void main(String[] args) {
		BMWcar car=new BMWcar();
		//we cannot create a object for abstract class
		car.start();
		car.stop();
		car.accel();
		car.music();
		Car c=new BMWcar(); //we can call interface in class though
		c.accel();
		c.start();
		c.stop();
		c.music();
		

	}

	@Override
	public void music() {
		System.out.println("music");
		
	}

	public void start() {
		//this function will over ride the start function created in abstract class as of same name
		System.out.println("new starting of car");
	
		
	}

}
