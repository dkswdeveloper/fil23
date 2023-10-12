package inh;

public abstract class Account {
	long acno;
	double balance;
	double rateInterest;
	
	public double getRateInterest() {
		return rateInterest;
	}
	public void setRateInterest(double rateInterest) {
		this.rateInterest = rateInterest;
	}
	
	public Account(long acno, double balance, double rateInterest) {
		super();
		this.acno = acno;
		this.balance = balance;
		this.rateInterest = rateInterest;
	}
	public Account(long acno, double balance) {
		super();
		this.acno = acno;
		this.balance = balance;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", balance=" + balance + "]";
	}
	
	public abstract void addInterest(int time);

}
