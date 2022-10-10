package OOPS;

public class childExample extends ParentExample {		
	//with extends child class can use parent class & vice versa is not true

	public static void main(String[] args) {
		
		childExample ce=new childExample();
		ce.flat();
		ce.bankloan();
		ce.car();
		ce.house();
		ce.bankbalance();
		
		ParentExample pe=new ParentExample();
		pe.bankbalance();
		pe.car();
		pe.house();
		
		System.out.println("Child are here");
	}
	public static void flat() {
		System.out.println("Flat");
	}

	public static void bankloan() {
		System.out.println("Bank Loan");
	}
}
