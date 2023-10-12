package inh;
//class Library
//{
//	isssue(Book book , Student student)
//	{
//		//logic
//	}
//	issue(Item item, Member member)
//	{
//		//logic
//	}
//}
public class Bank {
	public static void main(String[] args) {
		Account[] ar = { new SavingAccount(101, 34000),
				new LoanAccount(120, -2300000)};
		addInterest(ar);
	}
	public static void addInterest(Account[] ar)
	{
		for(Account acc : ar)
		{
			System.out.println(acc.getClass());
			acc.toString();
			acc.equals("hello");
			int hash = acc.hashCode();
			
			if(acc instanceof SavingAccount)
			{
				acc.setRateInterest(0.04);
			}
			else if(acc instanceof LoanAccount)
			{
				acc.setRateInterest(0.1);
			}
			acc.addInterest(90);
		}
	}

}
