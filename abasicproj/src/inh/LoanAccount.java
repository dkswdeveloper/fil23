package inh;

public class LoanAccount extends Account {
	

	public LoanAccount(long acno, double balance) {
		super(acno, balance);
	}

	@Override
	public void addInterest(int time) {
	
		double rate = super.getRateInterest();
		double newbal = super.getBalance() * time/365 * rate;
		super.setBalance(newbal);
		System.out.println("interest for Loan with rate : " + rate);
		
	}

}
