package sheet17ArrayLists;

import java.time.LocalDate;

public class Ex2Trainees {
	
	private String name;
	private String address;
	private LocalDate birthday;
	
	public static int id=235;

	public Ex2Trainees() {
		id++;
	}

	public Ex2Trainees(String name, String address, LocalDate birthday) {
		
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "ID: " +id+
				"\nTrainees name: " + name + 
				"\n Address: " + address +
				"\n Birthday: " + birthday;
	}
	
	

}
