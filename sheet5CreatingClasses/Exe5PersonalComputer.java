package sheet5CreatingClasses;

public class Exe5PersonalComputer {

	private int ram;
	private int hdDriver;
	private String os;
	private String monitorSize;
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

	}

	public Exe5PersonalComputer(String os, String monitorSize,int ram,int hdDriver,double cost){
		this.os = os;
		this.monitorSize = monitorSize;
		this.ram = ram;
		this.hdDriver = hdDriver;
		this.cost = cost;
	}

	public int getRam() {

		return ram;
	}
	public void setRam(int ram) {


		this.ram = ram;
	}
	public int getHdDriver() {
		return hdDriver;
	}
	public void setHdDriver(int hdDriver) {
		this.hdDriver = hdDriver;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		
		
		this.os = os;
	}
	public String getMonitorSize() {
		return monitorSize;
	}
	public void setMonitorSize(String monitorSize) {
		this.monitorSize = monitorSize;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}



}
