package sheet6ArraysOfObjects;

import sheet6ArraysOfObjects.PC.HardDrive;
import sheet6ArraysOfObjects.PC.MonitorSize;
import sheet6ArraysOfObjects.PC.OperatingSystem;
import sheet6ArraysOfObjects.PC.RamSize;

public class MainPC {

	public static void main(String[] args) {
		
		/*PC pc = new PC();
		System.out.println(pc);*/
		
		PC[] pc1 = {new PC(RamSize.RAM_8_GB,HardDrive.HARD_DRIVE_1_TB,OperatingSystem.LINUX,MonitorSize.MONITOR_27 ),
					new PC(RamSize.RAM_4_GB,HardDrive.HARD_DRIVE_500_GB,OperatingSystem.WINDOWS_7,MonitorSize.MONITOR_13),
					new PC(RamSize.RAM_8_GB,HardDrive.HARD_DRIVE_2TB,OperatingSystem.MAC_LEOPARD,MonitorSize.MONITOR_27),
					new PC(RamSize.RAM_16GB,HardDrive.HARD_DRIVE_500_GB,OperatingSystem.WINDOES_10,MonitorSize.MONITOR_17),
					new PC(RamSize.RAM_4_GB,HardDrive.HARD_DRIVE_1_TB,OperatingSystem.SOLARES,MonitorSize.MONITOR_13)
					
					
				
					};
		
		printPCcontent(pc1);
		
	}//main
	
 
	public static void printPCcontent(PC[] pcContent){
		
		for(int i=0; i< pcContent.length;i++){
			//double cost =400;
			if(pcContent[i].calculateCost()>= 400){
			System.out.println(pcContent[i]);
			}
		}
	}
}
