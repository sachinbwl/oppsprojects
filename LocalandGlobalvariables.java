package OOPS;

public class LocalandGlobalvariables {
	static int b=20; //Global Variable

	public static void main(String[] args) {
		
		System.out.println(b); //global variable can be used anywhere
		LocalandGlobalvariables fe=new LocalandGlobalvariables(); //create object
		fe.add(); //call non static function
		
		
	}
	
	public void add() {
		int a=10; //local variable
		System.out.println(a+b); //global variable can be called anywhere
		
	}

}
