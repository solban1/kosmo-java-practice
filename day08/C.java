class Account {
	private String ssn;
	long balance;

	Account(String ssn, long balance){
		this.ssn = ssn;
		this.balance = balance;
	}
	String getSsn(){
		return ssn;
	}
	long getBalance(){
		return balance;
	}
	/*void setSsn(String ssn){
		this.ssn = ssn;
	}*/
	void setBalance(long balance){
		this.balance = balance;
	}
}
class C 
{
	public static void main(String[] args) 
	{
		Account a = new Account("123456-1234567", 10000L);
		System.out.println("(1)ssn: " + a.getSsn());
		System.out.println("(1)balance: " + a.getSsn());
		//a.setSsn("654321-7654321");
		a.setBalance(500L);
		System.out.println("(2)ssn: " + a.getSsn());
		System.out.println("(2)balance: " + a.getSsn());
	}
}
