package sheet5CreatingClasses;

import sheet5CreatingClasses.PCwithENUMs.MonitorSize;
import sheet5CreatingClasses.PCwithENUMs.OperatingSystem;
import sheet5CreatingClasses.PCwithENUMs.HardDrive;
import sheet5CreatingClasses.PCwithENUMs.RamSize;

public class MainPCwithENUMs {

	public static void main(String[] args) {
		
		System.out.println("\n Default PC");
		PCwithENUMs pc1= new PCwithENUMs();
		System.out.println(pc1);
		
		PCwithENUMs pc2 = new PCwithENUMs(PCwithENUMs.RamSize.RAM_8_GB,PCwithENUMs.HardDrive.HARD_DRIVE_2TB,PCwithENUMs.OperatingSystem.MAC_LEOPARD,PCwithENUMs.MonitorSize.MONITOR_13);
		System.out.println(pc2);
		System.out.println("-----------------------------------------------");
		PCwithENUMs pc3 = new PCwithENUMs(PCwithENUMs.RamSize.RAM_16GB,PCwithENUMs.HardDrive.HARD_DRIVE_500_GB,PCwithENUMs.OperatingSystem.WINDOES_10,PCwithENUMs.MonitorSize.MONITOR_27);
		System.out.println(pc3);
		System.out.println("-----------------------------------------------");
	}

}
