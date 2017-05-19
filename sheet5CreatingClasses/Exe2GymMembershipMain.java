package sheet5CreatingClasses;



public class Exe2GymMembershipMain {

	public static void main(String[] args) {



/*
		Exe2GymMembership gym = new Exe2GymMembership();
		//gym.setMemberShipCost(850);+
		gym.setMonthlyPayment(Exe2GymMembership.YEARLY);

		System.out.println("Membership cost : "+gym.getMemberShipCost());
		System.out.println("Mothly payment : "+gym.getMonthlyPayment());
		System.out.println();*/

		
		Exe2GymMembership gym2 = new Exe2GymMembership(Exe2GymMembership.PAY_AS_YOU_GO);
		gym2.setMemberName(" Dublinya");
		System.out.println(gym2);

		System.out.println();
		Exe2GymMembership gym3 = new Exe2GymMembership(Exe2GymMembership.MONTHLY);
		gym3.setMemberName(" Adam");
		System.out.println(gym3);

		System.out.println();
		Exe2GymMembership gym4 = new Exe2GymMembership(450);
		gym4.setMemberName("Valery");
		System.out.println(gym4);
		
		System.out.println("---------------------------------\n");
		
		Exe2GymMembership[] members ={gym2,gym3,gym4, new Exe2GymMembership(Exe2GymMembership.YEARLY)};
		
		for(int i=0; i<members.length;i++){
			System.out.println();
			System.out.println(members[i]);
		}
	}

}
