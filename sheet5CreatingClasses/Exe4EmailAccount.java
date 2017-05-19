package sheet5CreatingClasses;

public class Exe4EmailAccount {


	//Member variables
	private int emailId;
	private String emailAddress;
	private String password;
	private double storageLimit;
	private double contractPrice;
	public static int emailCounter=101;
	
	public static final int MB_05 =500;
	public static final int GB_1 =1;
	public static final int GB_2 =2;
	public static final int GB_3 =3;
	public static final int GB_4 =4;
	public static final int GB_5 =5;
	public static final int GB_10 =10;
	public static final int GB_20 =20;
	public static final int GB_30 =30;
	public static final int GB_40 =40;
	public static final int GB_50 =50;





	public Exe4EmailAccount(){
		
		emailId= emailCounter;
		emailCounter++;
	}


	public Exe4EmailAccount(String emailAddress,String password,double storageLimit,double contractPrice){
		this();
		setEmailAddress(emailAddress);
		setPassword(password);
		setStorageLimit(storageLimit);
		setContractPrice(contractPrice);

	}


	public String getEmailAddress() {

		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		
		String regex = "[\\w.]+@[\\w-]+\\.[a-zA-Z]{2,}";

		/*if(emailAddress.contains("@") && emailAddress.contains(".")&&
								emailAddress.indexOf('@')< emailAddress.lastIndexOf('.')){*/
			if(emailAddress.matches(regex)){
				
				this.emailAddress = emailAddress;
		}else {
				System.out.println("Invalid Eamil or Password");
			//emailAddress = "Invalid Eamil or Password";
			
			}
	}
	public String getPassword() {

		return password;
		

	}

	public void setPassword(String password) {
		
		password=password.trim(); 
			
		if(password.length()>=4 && password.length()<=9){
			this.password = password;
		}
		else{
			System.out.println(" The passwors shoud between 4 and 9 caracters.");
			System.out.println("Invalid Password");
			//password = "Invalid Password";
		}


	}
	public double getStorageLimit() {
		return storageLimit;
	}
	public void setStorageLimit(double storageLimit) {
		if(storageLimit>=GB_1 && storageLimit<=GB_50){

			//			storageLimit = storageLimit /1024;
			this.storageLimit = storageLimit;
			
		}else if(storageLimit >=1000 && storageLimit<=50_000){
			if(storageLimit>1000)
				storageLimit/=1024;
			this.storageLimit = storageLimit;
		}
		else if(storageLimit<=MB_05){
			System.out.println("\nThe free storige limit is 500 MB");
		}
	}




	public double getContractPrice() {

		if(contractPrice == GB_1){
			//contractPrice = 5;
		}
		else if(contractPrice == GB_2){
			//contractPrice = 8;
		}else if(contractPrice == GB_3){
			contractPrice = 12;
		}else if(contractPrice == GB_4){
			contractPrice = 18 ;
		}
		else if(contractPrice == GB_10){
			contractPrice = 25;
		}
		else if(contractPrice == GB_20){
			contractPrice =28 ;
		}else if(contractPrice == GB_30){
			contractPrice = 30 ;
		}else if(contractPrice == GB_40){
			contractPrice = 32 ;
		}else if(contractPrice == GB_50){
			contractPrice =35 ;
		}

		return contractPrice;
	}


	public void setContractPrice(double contractPrice) {


		this.contractPrice = contractPrice;
	}

/*
	@Override
	public String toString(){
		return " Email counter : " + emailCounter+
				"\n Email :"+ emailAddress +
				"\n Password :"+password +
				"\n Storage limit : " +(int)storageLimit + " GB"+
				"\n Contract Price : € "+getContractPrice(); 
	}*/

	

	@Override
	public String toString(){
		return String.format(" Email ID :%d \n Email: %s \n Password : %s \n Storage limit : %.2f GB \n Contract price : €%.2f", emailId,emailAddress,password,storageLimit,getContractPrice());
	}
}
