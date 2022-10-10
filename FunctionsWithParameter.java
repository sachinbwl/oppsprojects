package OOPS;

public class FunctionsWithParameter {

	public static void main(String[] args) {
		
		FunctionsWithParameter apple=new FunctionsWithParameter();
		apple.add(10,20);
		apple.add(23,34);
		apple.add(34,45);
		apple.add(25,67);
		apple.add(26,57);
		apple.add(2,7,9);
		
//this class is example of new function with keeping parameters assigning in main function

	}
	
public void add(int a, int b) {
	
	System.out.println(a+b);
}

public void add(int a, int b, int c) {
	
	System.out.println(a+b-c);
}

}
