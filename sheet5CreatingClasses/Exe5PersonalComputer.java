package sheet5CreatingClasses;

public class Exe5PersonalComputer {

	private int pcID;
	
	//the pcCounter has to be public static
	public static int pcCounter=45;
	private int ram;
	private int hdDriver;
	private String os;
	private int monitorSize;
	private double cost;


	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	public static final int HDD_250_GB = 250;
	public static final int HDD_500_GB = 500;
	public static final int HDD_750_GB = 750;
	public static final int HARD_DRIVE_1_TB = 1;
	public static final int HARD_DRIVE_2_TB = 2;
	
	public static final int MONITOR_SIZE_15 =15;
	public static final int MONITOR_SIZE_17 =17;
	public static final int MONITOR_SIZE_20 =20;
	
	public static final String OS_LINUX = "Linux";
	public static final String OS_SOLARIS;
	public static final String OS_MAC_LEOPARD;
	public static final String OS_WINDOWS_7;
	public static final String OS_WINDOWS_10;


	static {
		OS_MAC_LEOPARD = "Mac Leopard";
		OS_SOLARIS = "Solaris";
		OS_WINDOWS_10 = "Windows 10";
		OS_WINDOWS_7 = "Windows_7";
	}
	
	public Exe5PersonalComputer(){
		pcID = pcCounter;
		pcCounter++;
		ram = RAM_4_GB;
		hdDriver = HDD_250_GB;
		monitorSize = MONITOR_SIZE_15;
		os = OS_WINDOWS_7;
		cost = 350;
	}
	
	

	public Exe5PersonalComputer(String os, int monitorSize,int ram,int hdDriver){
		this();
		setOs(os);
		setMonitorSize(monitorSize);
		setRam(ram);
		setHdDriver(hdDriver);
	}

	public int getRam() {

		return ram;
	}
	
	public void setRam(int ram) {

		//if(ram>=RAM_4_GB && ram <= RAM_16_GB){
		if(ram == RAM_4_GB || ram == RAM_8_GB || ram == RAM_16_GB){
			this.ram = ram;
		}
		else{
			//this.ram = RAM_4_GB;
			System.out.println("Wrong type of RAM, it is set to 4 GB");
		}

	}
	
	public int getHdDriver() {
		return hdDriver;
	}
	
	public void setHdDriver(int hdDriver) {
		
		//if(hdDriver >= HDD_250_GB && hdDriver <= HDD_750_GB){
		if(hdDriver == HDD_250_GB || hdDriver == HDD_500_GB || hdDriver == HDD_750_GB ||
				hdDriver == HARD_DRIVE_1_TB || hdDriver == HARD_DRIVE_2_TB){
			
			this.hdDriver = hdDriver;
		}
		else{
			System.out.println(" It is out of stock");
			System.out.println("HDD is set back to 250 GB");
			//this.hdDriver = HDD_250_GB;
		}
	}
	
	public String getOs() {
		
			return os;
	}
	
	public void setOs(String os) {
		
		if(os.equals(OS_LINUX) || os.equals(OS_MAC_LEOPARD) ||
				os.equals(OS_SOLARIS) || os.equals(OS_WINDOWS_10)|| os.equals(OS_WINDOWS_7)){
			
			this.os = os;
		
		}else{
			System.out.println("Invaled operation system, setting to the default Windows 7");
		}
		
	}
	public int getMonitorSize() {
		return monitorSize;
	}
	public void setMonitorSize(int monitorSize) {
		
		//if(monitorSize == MONITOR_SIZE_15|| monitorSize == MONITOR_SIZE_17 || monitorSize == MONITOR_SIZE_20){
		/*if(monitorSize >= MONITOR_SIZE_15 && monitorSize <= MONITOR_SIZE_20){
			
			this.monitorSize = monitorSize;
		}else{
			System.out.println(monitorSize + " inch monitor is out of stock");
			this.monitorSize = MONITOR_SIZE_15;
		}*/
		
		switch(monitorSize){
		case MONITOR_SIZE_15:
		case MONITOR_SIZE_17:
		case MONITOR_SIZE_20:
			this.monitorSize = monitorSize;
			break;
		default:
			System.out.println("invaled monitor size, setting to the default of 15\"");
		
		}
	}
	
	
	public double claculateCost() {
		
		if(ram==8)
			cost +=20;
		
		else if(ram==16)
			cost +=40;
		
		if(hdDriver==HDD_500_GB)
			cost +=20;
		else if(hdDriver == HDD_750_GB)
			cost += 40;
		else if(hdDriver == HARD_DRIVE_1_TB)
			cost += 60;
		else if(hdDriver == HARD_DRIVE_2_TB)
			cost += 100;
		
		if(monitorSize==MONITOR_SIZE_17)
			cost += 25;
		else if(monitorSize == MONITOR_SIZE_20)
			cost += 35;
		
		return cost;
	}
	
	
	
	/*public int getPcID(){
		return pcID;
	}*/
	
	
	
	public String getMonitorSizeAsString(){
		switch (monitorSize) {
		case MONITOR_SIZE_15:
			return "15\"";
		case MONITOR_SIZE_17:
			return "17\"";
		case MONITOR_SIZE_20:
			return "20\"";

		default:
			return "Out of stock";
		}
	}

	@Override
	public String toString() {
		return " PC ID number: " + pcID+
				"\n RAM: " + ram +" GB"+
				"\n HDD: " + hdDriver+(hdDriver == HDD_250_GB ? "GB" : "TB") + 
				"\n OS: " + os +
				"\n Monitor Size: "+ getMonitorSizeAsString()+
				String.format("\n Cost: €%.2f",claculateCost());
				
	}



}
