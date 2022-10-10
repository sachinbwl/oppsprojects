package OOPS;

public class SampleTest {
//to learn about constructor 
	public SampleTest() {
		//constructor build with same class name only
		System.out.println("Constructor executed");
	}
	public SampleTest(String st) {
		//two constructor can not have same name or parameters
		System.out.println("Constructor with parameter executed");
	}
	
	public static void main(String[] args) {
		SampleTest st=new SampleTest(); //just by creating an object we are calling constructor function also
		SampleTest st1=new SampleTest();
		SampleTest st2=new SampleTest(); 
		
		SampleTest st3=new SampleTest("Selenium Class"); 
		SampleTest st4=new SampleTest("Java Class"); 
		
		
		st.add();
		

	}
	public void add() {
		System.out.println("Additional function");
	}

}
