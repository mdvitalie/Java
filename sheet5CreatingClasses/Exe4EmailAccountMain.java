package sheet5CreatingClasses;

public class Exe4EmailAccountMain {

	public static void main(String[] args) {
		
		//Exe4EmailAccount emailAccount = new Exe4EmailAccount();
		
		/*emailAccount.setEmailAddress("gorbunov@gmail.com");
		emailAccount.setPassword("123456789");
		emailAccount.setStorageLimit(2000);
		
		System.out.println();
		System.out.println(" Email counter : " +Exe4EmailAccount.emailCounter);
		System.out.println(" Email: " + emailAccount.getEmailAddress());
		System.out.println(" Password : " + emailAccount.getPassword());
		System.out.println(" Storage limit : " + emailAccount.getStorageLimit()+" MB");
		System.out.println("______________________________________");*/
		
		
		System.out.println();
		Exe4EmailAccount email = new Exe4EmailAccount("drobox@gmail.com"," 987456321 ",Exe4EmailAccount.GB_1,25);
		System.out.println(email);
		System.out.println("______________________________________");
		
		System.out.println();
		Exe4EmailAccount email2 = new Exe4EmailAccount("dr12obo@gmail.com","90asdf10",Exe4EmailAccount.GB_30,12);
		System.out.println(email2);
		System.out.println("______________________________________");
		
	
		System.out.println();
		Exe4EmailAccount email3 = new Exe4EmailAccount("VotosGonzales@gmail.com","mD1234dg%",Exe4EmailAccount.GB_50,35);
		System.out.println(email3);
		System.out.println("______________________________________");
		/*
		System.out.println();
		Exe4EmailAccount email4 = new Exe4EmailAccount("dublinireland@gmail.com","mD1234dg%",100_000,5);
		System.out.println(email4);
		System.out.println("______________________________________");
		
		
		System.out.println("\n#####################################################\n");
		
		
		Exe4EmailAccount[] emailAccouns = {email,email2,email3,email4,
				new Exe4EmailAccount("vovadugals@gmail.com", "4568456", Exe4EmailAccount.GB_10,55),
				new Exe4EmailAccount("constantinos78@gmail.com", "sd34fre%^", Exe4EmailAccount.GB_1,0.50),
				new Exe4EmailAccount("popandopolos108@gmail.com", "sd34€€%^", Exe4EmailAccount.GB_10,5)
		};
		
				for(int i=0; i<emailAccouns.length; i++){
					System.out.println();
					System.out.println(emailAccouns[i]);
					System.out.println("\n____________________________");
					
				}*/
	}

}
