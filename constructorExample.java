package OOPS;

public class constructorExample {

	public constructorExample() {
		//constructor build with same class name only
		System.out.println("Constructor Example");
	}
	
	public constructorExample(String st) {
		//two constructor can not have same name or parameters
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		
		constructorExample ce1=new constructorExample();
		constructorExample ce2=new constructorExample();
		constructorExample ce3=new constructorExample();
		constructorExample ce4=new constructorExample();
		constructorExample ce5=new constructorExample("Constructor with parameter");
		
	}

}
