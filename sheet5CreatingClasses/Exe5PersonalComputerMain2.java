package sheet5CreatingClasses;

public class Exe5PersonalComputerMain2 {

	public static void main(String[] args) {
//		Exe5PersonalComputer2 pc = new Exe5PersonalComputer2();
//		System.out.println("value of OS Solarus: " + Exe5PersonalComputer2.OS_SOLARIS);
//		
//		Exe5PersonalComputer2 pc2 = new Exe5PersonalComputer2();
		
//		System.out.println("---------------------------------------------\n");
//		Exe5PersonalComputer2 pc3 = new Exe5PersonalComputer2(Exe5PersonalComputer2.OS_WINDOWS_10,Exe5PersonalComputer2.MonitorSize.MONITOR_SIZE_22,8,1);
//		System.out.println(pc3);
//		
//		System.out.println("---------------------------------------------\n");
//		Exe5PersonalComputer2 pc4 = new Exe5PersonalComputer2(Exe5PersonalComputer2.OS_WINDOWS_10,Exe5PersonalComputer2.MonitorSize.MONITOR_SIZE_55,8,2);
//		System.out.println(pc4);
		
		System.out.println("---------------------------------------------\n");
		System.out.println("######################");
		Exe5PersonalComputer2 pc5 = new Exe5PersonalComputer2(Exe5PersonalComputer2.OS_LINUX,Exe5PersonalComputer2.MonitorSize.MONITOR_SIZE_22,
																8,Exe5PersonalComputer2.HDD_750_GB);
		System.out.println(pc5);
		
		
		System.out.println("---------------------------------------------\n");
		
		Exe5PersonalComputer2 pc6 = new Exe5PersonalComputer2();
		pc6.setRam(Exe5PersonalComputer2.RAM_8_GB);
		pc6.setHdDriver(Exe5PersonalComputer2.HARD_DRIVE_1_TB);
		
		System.out.println(pc6);
		
		//Exe5PersonalComputer2 [] allPcs = {pc,pc2,pc3,pc4,pc5,pc6};
		Exe5PersonalComputer2 [] allPcs = {pc5,pc6};
		
		printPCArray(allPcs);
	}
	
	
	public static void printPCArray(Exe5PersonalComputer2[] arrayOfPCs){
		
		for(Exe5PersonalComputer2 onePC : arrayOfPCs){
			System.out.println("================================\n");
			System.out.println(onePC);
		}
	}

}
