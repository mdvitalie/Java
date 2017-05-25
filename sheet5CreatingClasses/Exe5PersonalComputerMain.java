package sheet5CreatingClasses;

public class Exe5PersonalComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exe5PersonalComputer exe5 = new Exe5PersonalComputer();
		System.out.println(exe5);
		/*
		System.out.println("--------------------------------------\n");
		Exe5PersonalComputer exe52 = new Exe5PersonalComputer("W7",15,16,500);
		System.out.println(exe52);
		
		System.out.println("--------------------------------------\n");
		Exe5PersonalComputer exe53 = new Exe5PersonalComputer("Linux",20,8,750);
		System.out.println(exe53);

		System.out.println("--------------------------------------\n");
		Exe5PersonalComputer exe54 = new Exe5PersonalComputer(Exe5PersonalComputer.OS_SOLARIS,16,2);
		System.out.println(exe54);*/
		
		System.out.println("----------------------------------------------\n");
		Exe5PersonalComputer exe55 = new Exe5PersonalComputer(Exe5PersonalComputer.OS_WINDOWS_10,
				Exe5PersonalComputer.MONITOR_SIZE_20,
				Exe5PersonalComputer.RAM_8_GB,Exe5PersonalComputer.HARD_DRIVE_2_TB
				);
		System.out.println(exe55);
		
		
		
		System.out.println("----------------------------------------------\n");
		Exe5PersonalComputer exe56 = new Exe5PersonalComputer(Exe5PersonalComputer.OS_WINDOWS_10,
				Exe5PersonalComputer.MONITOR_SIZE_17,
				Exe5PersonalComputer.RAM_8_GB,Exe5PersonalComputer.HARD_DRIVE_2_TB
				);
		System.out.println(exe56);
		System.out.println("----------------------------------------------\n");
		Exe5PersonalComputer exe57 = new Exe5PersonalComputer(Exe5PersonalComputer.OS_MAC_LEOPARD,
				Exe5PersonalComputer.MONITOR_SIZE_17,
				Exe5PersonalComputer.RAM_8_GB,Exe5PersonalComputer.HDD_750_GB
				);
		System.out.println(exe57);
	}

}
