package sheet8BankAccount;

public class BankAccount {

	//Member variables
	private String name;
	private String address;
	private int accountNumber;
	private double balance;
	
	//Static /class variables
	public static final double INTREST_RATE =5;
	public static int numOfBankAcounts;
	public static int newAccountNumberCounter = 50008000;
	
	
	private BankAccount() {
		numOfBankAcounts++;
		accountNumber = newAccountNumberCounter++;
	}

	

	public BankAccount(String name, String address) {
		this();
		this.name = name;
		this.address = address;
	}



	public BankAccount(String name, String address, double balance) {
		this();
		setName(name);
		this.address = address;
		//setAccountNumber(accountNumber);
		this.balance = balance;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		String regex= "[a-zA-z]+";
		if(name.matches(regex)){
			System.out.println("Invaled name");
		}
		else{
			this.name = name;
		}
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

//Methods
	public void depositMoney(double deposit){
		if(deposit > 0){
		     balance += deposit;
		System.out.println(" Lodgement: "+ deposit);
		}
		else{
		System.out.println( deposit+"can not be negative");
		}
	}
	
	public void withdrawMoney(double withdraw){
		
		if(withdraw> balance){
			System.out.println(" No sufficient money in your account");
			System.out.println(" The amount you can withdraw: " +balance);
			
		}else{
			
			this.balance -= withdraw;
			System.out.println(" Withdraw: " + withdraw);
		}
	}
	
	public void withdrawAll(){
		
		System.out.printf("About to withdraw all, you have a balance of €%.2f\n",balance);
		
	}
	
	public void checkBalance(){
		setBalance(balance);
		System.out.println(" Total balance: " + balance);
	}
	
	public double addInterest(){
//		balance *= intrest;
		balance = balance + (INTREST_RATE/100);
		System.out.println( " Intrest of "+INTREST_RATE+"% :" + balance);

		return balance;
	}



	@Override
	public String toString() {
		return  "\n Name: \t" + name +
				"\n Address: " + address +
				"\n Account number: " + accountNumber +
				"\n Balance: "
				+ balance;
	}
	
	
	
	
	
}
