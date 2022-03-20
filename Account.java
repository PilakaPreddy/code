package labweek6prog;

public class Account {
	int acno,balance;
	double rate;
	String date;
	
	Account(int a,int b,double r,String d)
	{
		acno=a;
		balance=b;
		rate=r;
		date=d;
		
	}
	void deposit(int x)
	{
		balance=balance+x;
		System.out.println(x+"deposited");
		
	}
	void withdraw(int x)
	{
		balance=balance-x;
		System.out.println(x+"withdrawn");
		
		
	}
	public String toString()
	{
		return"Account no:"+acno+"\nBalance+"\nRate of interest:"+rate"Account\n"+create
	}
}
