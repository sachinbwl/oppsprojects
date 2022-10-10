package OOPS;

public class SachinBank implements Bank{
	//by using implements we are bonding SachinBank to satisfy all conditions of Bank.
	public static void main(String[] args) {
		SachinBank SB=new SachinBank(); 
		SB.debit();
		SB.credit();
		SB.savings();
		SB.loans();
		System.out.println("______________________");
		Bank B=new SachinBank(); //only functions in Bank interface can be called through object B
		B.debit();
		B.credit();
		B.savings();
		
	}

	@Override
	public void debit() {
		System.out.println("Debit");
		
	}

	@Override
	public void credit() {
		System.out.println("Credit");
		
	}

	@Override
	public void savings() {
		System.out.println("savings");
		
	}
	
	public void loans() {
		System.out.println("Loans");
		
	}

}
