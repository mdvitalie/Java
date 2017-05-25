package sheet8BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(" Vova Volchenko","Ireland Dublin 21 avenue",45000);
		System.out.println(bank);
		
		bank.withdrawMoney(5000);
		bank.addInterest();
		
		System.out.println(bank);
		
		bank.depositMoney(200);
		System.out.println(bank);
		
		bank.withdrawMoney(50);
		System.out.println(bank);
		
		bank.checkBalance();
		System.out.println("#########################");
		System.out.println(bank);

	}

}
