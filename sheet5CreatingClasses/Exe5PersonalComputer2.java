package sheet5CreatingClasses;

public class Exe5PersonalComputer2 {
	
	
	private int pcID;
	
	//the pcCounter has to be public static
	public static int pcCounter=45;
	private int ram;
	private int hdDriver;
	private String os;
	private MonitorSize monitorSize;
	private double cost;


	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	public static final int HDD_250_GB = 250;
	public static final int HDD_500_GB = 500;
	public static final int HDD_750_GB = 750;
	public static final int HARD_DRIVE_1_TB = 1;
	public static final int HARD_DRIVE_2_TB = 2;
	
	/*public static final int MONITOR_SIZE_15 =15;
	public static final int MONITOR_SIZE_17 =17;
	public static final int MONITOR_SIZE_20 =20;*/
	
	public static final String OS_LINUX = "Linux";
	public static final String OS_SOLARIS;
	public static final String OS_MAC_LEOPARD;
	public static final String OS_WINDOWS_7;
	public static final String OS_WINDOWS_10;
	
	
	/* An enum is where you make up your own datatype, e.g. it's not
	 * and int with ~9.8 million possible values it's a MonitorSize
	 * with 11 possible values.
	 * To access an enum's value in THIS class, it will be:
	 * 
	 *   		MonitorSize.MONITOR_36
	 *   
	 * HUGE advantage: I don't need to validate the value for MonitorSize
	 * in the set method because the compiler will only allow a value
	 * from the list here.    
	 * 
	 * An enum can be declared inside a class, e.g. inside the curly 
	 * brackets of PC or in a file of its own.
	 **/
	
	public enum MonitorSize {MONITOR_SIZE_13,MONITOR_SIZE_15,MONITOR_SIZE_17,MONITOR_SIZE_22,
							MONITOR_SIZE_27,MONITOR_SIZE_32,MONITOR_SIZE_36,MONITOR_SIZE_46,
							MONITOR_SIZE_55,MONITOR_SIZE_66,MONITOR_SIZE_72, MONITOR_SIZE_100
						};


						/* A static initialisation block. This can be used to initialise
						 * static variables. Static variables belong to the class, they
						 * exist before any objects are created. Their values can be used
						 * for creating objects and given to member variables.
						 * Member variables belong to the object, every time an object is
						 * created, e.g.  		 PC pc1 = new PC(); 
						 * the object gets a copy of each member variables. 
						 * 
						 * Static variable exists before member variables. A class is a 
						 * template for creating objects, the class must exist before objects
						 * can be created. 
						 * 
						 * A final variable must be initialised. I.e. it must be given a 
						 * value either on the line where it is declared OR in a static 
						 * initialisation block. 
						 * 
						 * A static block will execute before any constructors are called. 
						 * */
						
	static {
		OS_MAC_LEOPARD = "Mac Leopard";
		OS_SOLARIS = "Solaris";
		OS_WINDOWS_10 = "Windows 10";
		OS_WINDOWS_7 = "Windows_7";
	}
	
	public Exe5PersonalComputer2(){
		pcID = pcCounter;
		pcCounter++;
		ram = RAM_4_GB;
		hdDriver = HDD_250_GB;
		monitorSize = MonitorSize.MONITOR_SIZE_15;
		os = OS_WINDOWS_7;
		//cost = 350;
	}
	
	

	public Exe5PersonalComputer2(String os, MonitorSize monitorSize,int ram,int hdDriver){
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
	public  MonitorSize getMonitorSize() {
		return monitorSize;
	}
	public void setMonitorSize(MonitorSize monitorSize) {
		
		this.monitorSize = monitorSize;
	}
	
	
	public double claculateCost() {
		
		cost = 350;
		
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
		
		
		switch (monitorSize) {
		
			case MONITOR_SIZE_13:
				cost -=40; 			break;
			case MONITOR_SIZE_17:
				cost +=20;			break;
			case MONITOR_SIZE_22:
				cost +=25; 			break;
			case MONITOR_SIZE_27:
				cost +=40;			break;
			case MONITOR_SIZE_32:
				cost +=60;			break;
			case MONITOR_SIZE_36:
				cost +=80;			break;
			case MONITOR_SIZE_46:
				cost +=100;			break;
			case MONITOR_SIZE_55:
				cost +=120;			break;
			case MONITOR_SIZE_66:
				cost +=140;			break;
			case MONITOR_SIZE_72:
				cost += 160;		break;
			case MONITOR_SIZE_100:
				cost +=180;			break;

			default:
				cost +=0;
				System.out.println("Not such Monitor size, it is set to the default parameters ");
				break;
		}
		
		return cost;
	}
	
	
	
	/*public int getPcID(){
		return pcID;
	}*/
	
	
	
	/*public String getMonitorSizeAsString(){
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
	

	@Override
	public String toString() {
		return " PC ID number: " + pcID+
				"\n RAM: " + ram +" GB"+
				"\n HDD: " + hdDriver+(hdDriver == HDD_250_GB ? "GB" : "TB") + 
				"\n OS: " + os +
				//"\n Monitor Size: "+ getMonitorSizeAsString()+
				String.format("\n Cost: €%.2f",claculateCost());
				
	}*/
	@Override
	public String toString() {
		return " PC ID number: " + pcID+
				"\n RAM: " + ram +" GB"+
				"\n HDD: " + hdDriver+(hdDriver == HDD_250_GB ? "GB" : "TB") + 
				"\n OS: " + os +
				"\n Monitor Size: "+ monitorSize.toString().toLowerCase().replace("_", " ").replace("m", "M")+
				String.format("\n Cost: €%.2f",claculateCost());
		
	}



}