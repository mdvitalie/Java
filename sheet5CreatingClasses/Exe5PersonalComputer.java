package sheet5CreatingClasses;

public class Exe5PersonalComputer {

	private int pcID;
	private int pcCounter;
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
	
	public static final int MONITOR_SIZE_15 =15;
	public static final int MONITOR_SIZE_17 =17;
	public static final int MONITOR_SIZE_20 =20;


	public Exe5PersonalComputer(){
		pcID = pcCounter;
		pcCounter++;
		ram = RAM_4_GB;
		hdDriver = HDD_250_GB;
		monitorSize = MONITOR_SIZE_15;
	}
	
	

	public Exe5PersonalComputer(String os, int monitorSize,int ram,int hdDriver,double cost){
		this();
		setOs(os);
		setMonitorSize(monitorSize);
		setRam(ram);
		setHdDriver(hdDriver);
		this.cost = cost;
	}

	public int getRam() {

		return ram;
	}
	
	public void setRam(int ram) {

		//if(ram == RAM_4_GB || ram == RAM_8_GB || ram == RAM_16_GB){
			if(ram>=RAM_4_GB && ram <= RAM_16_GB){
			this.ram = ram;
		}
		else{
			this.ram = RAM_4_GB;
			System.out.println("Wrong type of RAM, it is set to 4 GB");
		}

	}
	
	public int getHdDriver() {
		return hdDriver;
	}
	
	public void setHdDriver(int hdDriver) {
		
		if(hdDriver >= HDD_250_GB && hdDriver <= HDD_750_GB){
			
			this.hdDriver = hdDriver;
		}
		else{
			System.out.println(" It is out of stock");
			System.out.println("HDD is set back to 250 GB");
			this.hdDriver = HDD_250_GB;
		}
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		
		this.os = os;
		
	}
	public int getMonitorSize() {
		return monitorSize;
	}
	public void setMonitorSize(int monitorSize) {
		
		//if(monitorSize == MONITOR_SIZE_15|| monitorSize == MONITOR_SIZE_17 || monitorSize == MONITOR_SIZE_20){
		if(monitorSize >= MONITOR_SIZE_15 && monitorSize <= MONITOR_SIZE_20){
			
			this.monitorSize = monitorSize;
		}else{
			System.out.println(monitorSize + " inch monitor is out of stock");
			this.monitorSize = MONITOR_SIZE_15;
		}
	}
	
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public int getPcID(){
		return pcID;
	}
	
	
	
	public String getMonitorSizeAsString(){
		switch (monitorSize) {
		case MONITOR_SIZE_15:
			return "15 inches monitor";
		case MONITOR_SIZE_17:
			return "17 inches monitor";
		case MONITOR_SIZE_20:
			return "20 inches monitor";

		default:
			return "Out of stock";
		}
	}

	@Override
	public String toString() {
		return " PC ID number: " + pcID+
				"\n RAM: " + ram +" GB"+
				"\n HDD: " + hdDriver+" GB" + 
				"\n OS: " + os +
				"\n Monitor Size: "+ getMonitorSizeAsString()+
				"\n Cost: €" + cost;
	}



}
