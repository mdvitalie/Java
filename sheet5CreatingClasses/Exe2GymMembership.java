package sheet5CreatingClasses;

public class Exe2GymMembership {

	//Member variables

	private int id;
	private double memberShipCost;
	private int monthlyPayment;
	private String memberName;
	private static int memberShipNum =1;

	public static final int PAY_AS_YOU_GO = 1;
	public static final int MONTHLY = 2;
	public static final int YEARLY = 3;


	public Exe2GymMembership(){
		id= memberShipNum;
		memberShipNum++;
		monthlyPayment = MONTHLY;
	}

	public Exe2GymMembership(int monthlyPayment){
		this();
		//setMemberShipCost(memberShipCost);
		setMonthlyPayment(monthlyPayment);
	}

	public double getMemberShipCost() {

		if (monthlyPayment == PAY_AS_YOU_GO)
			memberShipCost = 7;
		else if (monthlyPayment == MONTHLY)
			memberShipCost = 39;
		else if (monthlyPayment == YEARLY)
			memberShipCost = 800;
		else 
			memberShipCost = 39; // default is to pay monthly

		return memberShipCost;
	}
	//	public void setMemberShipCost(double memberShipCost) {
	//		this.memberShipCost = memberShipCost;
	//	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(int monthlyPayment) {
		if (monthlyPayment == PAY_AS_YOU_GO || monthlyPayment == MONTHLY || monthlyPayment == YEARLY)
			this.monthlyPayment = monthlyPayment;
		else // default 
			this.monthlyPayment = MONTHLY;
	}

	public int getId(){
		return id;
	}



	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	private String getPaymentFrequencyAsString() {
		switch (monthlyPayment) {
		case PAY_AS_YOU_GO:
			return "Pay as you go";
		case MONTHLY:
			return "Monthly payment";
		case YEARLY:
			return "Yearly payment";
		default:
			return "Payment type not set";
		}
	}


	@Override
	public String toString(){
		return "Member id: "+ id+"\nName: "+ memberName+ "\n"+ getPaymentFrequencyAsString() + "\nMembership cost: €"+ 
				getMemberShipCost();
	}
}
