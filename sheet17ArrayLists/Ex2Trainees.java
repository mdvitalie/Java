package sheet17ArrayLists;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2Trainees {
	
	private int id;
	private String name;
	private String address;
	private LocalDate birthday;
	
	public static int idTrainee=235;

	public Ex2Trainees() {
		id = idTrainee++;
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
	
	public boolean equals(Object obj){
		Ex2Trainees trainees = (Ex2Trainees)obj;
		
		if(this.name.equals(trainees.name)  && this.address.equals(trainees.address) && this.birthday.equals(trainees.birthday)){
			
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "ID: " +id+
				"\nTrainees name: " + name + 
				"\n Address: " + address +
				"\n Birthday: " + birthday.format(formatter);
				
	
	
	}
}
