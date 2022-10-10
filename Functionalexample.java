package OOPS;

public class Functionalexample {

	public static void main(String[] args) {
	
		Functionalexample fe=new Functionalexample();
		//not static functions are called by object creation only
		fe.musicplayer();
		fe.horn();
		//static functions are called without object reference
		function(); //or as below
		Functionalexample.function(); //will print two times as we called same function two times
	}

	public void musicplayer() {
		
		System.out.println("Play the Music");
	}
	public void horn() {
		
		System.out.println("Horn");
	}
	public static void function() {
		System.out.println("Static function is called");
	}
	
	
}
