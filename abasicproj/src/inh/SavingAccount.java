package inh;

public class SavingAccount extends Account {
	

	public SavingAccount(long acno, double balance) {
		super(acno, balance);
	}

	@Override
	public void addInterest(int time) {
	
		double rate = super.getRateInterest();
		double newbal = super.getBalance() * time/365 * rate;
		super.setBalance(newbal);
		System.out.println("interest addded with rate : " + rate);
		
	}

}
