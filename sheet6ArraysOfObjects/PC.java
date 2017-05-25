package sheet6ArraysOfObjects;



public class PC {
	private int pcID;
	public static int pcCounter=1;
	private RamSize ram;
	private HardDrive hardDrive;
	private OperatingSystem os;
	private MonitorSize monitorSize;
	
	private double cost;
	
	
	enum RamSize {RAM_4_GB, RAM_8_GB, RAM_16GB}
	
	enum HardDrive {HARD_DRIVE_500_GB,HARD_DRIVE_1_TB,HARD_DRIVE_2TB}
	
	enum OperatingSystem{LINUX,SOLARES,MAC_LEOPARD,WINDOWS_7,WINDOES_10}
	
	public enum MonitorSize {MONITOR_13,MONITOR_15,MONITOR_17,MONITOR_22,MONITOR_27,MONITOR_32,
		
							MONITOR_36,MONITOR_46,MONITOR_55,MONITOR_66,MONITOR_72,MONITOR_100
				}

	public PC() {
		
		pcID=pcCounter;
		pcCounter++;
		
		ram = RamSize.RAM_4_GB;
		hardDrive = HardDrive.HARD_DRIVE_500_GB;
		os = OperatingSystem.WINDOWS_7;
		monitorSize = MonitorSize.MONITOR_17;
		cost = 350;
	}

	public PC(RamSize ram, HardDrive hardDrive, OperatingSystem os, MonitorSize monitorSize) {
		this();
		setRam(ram);
		setHardDrive(hardDrive);
		setOs(os);
		setMonitorSize(monitorSize);
	}

	public RamSize getRam() {
		return ram;
	}

	public void setRam(RamSize ram) {
		this.ram = ram;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	public MonitorSize getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(MonitorSize monitorSize) {
		this.monitorSize = monitorSize;
	}
	
	
	public double calculateCost(){
		cost = 350;
		
		if(ram == RamSize.RAM_8_GB)
			cost +=20;
		else if(ram == RamSize.RAM_16GB)
			cost +=40;
		
		if(hardDrive == HardDrive.HARD_DRIVE_1_TB)
			cost +=60;
		else if(hardDrive == HardDrive.HARD_DRIVE_2TB)
			cost +=80;
		
		if(os == OperatingSystem.LINUX || os == OperatingSystem.SOLARES)
			cost -=20;
		else if(os == OperatingSystem.MAC_LEOPARD)
			cost +=1000;
		else if(os == OperatingSystem.WINDOES_10)
			cost += 40;
		
		
		//MONITOR SIZE
		switch (monitorSize) {
		case MONITOR_13:
			cost -=40;		break;
		case MONITOR_15:
			cost -=20;		break;
		case MONITOR_22:
			cost +=20;		break;
		case MONITOR_27:
			cost +=40;		break;
		case MONITOR_32:
			cost += 60; 	break;
		case MONITOR_36:
			cost +=80;		break;
		case MONITOR_46:	
			cost +=100; 	break;
		case MONITOR_55:
			cost +=120;		break;
		case MONITOR_66:
			cost +=140;		break;
		case MONITOR_72:
			cost +=160;		break;
		case MONITOR_100:
			cost += 180;	break;

		default:
			cost +=0;
			break;
		}
		return cost;
	}
	
	
	
				
	@Override
	public String toString(){
		return "\n PC number: " + pcID + "\n--------------"+
				"\n OS system: "+os +
				"\n RAM: " + ram +
				"\n Monitor size: "+ monitorSize.toString().replaceAll("_", " ").replaceAll("m", "M")+ "\""+
				String.format("\n Cost: €%.2f",calculateCost());
	}
				
	
}