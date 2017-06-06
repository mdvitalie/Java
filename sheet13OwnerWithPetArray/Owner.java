package sheet13OwnerWithPetArray;

import java.util.Arrays;

public class Owner {

	
	private String name;
	private String address;
	private String phone;
	private Pet[] pets;
	
	

	
	public Owner(String name, String address, String phone, Pet[] pets) {
	
		this.name = name;
		this.address = address;
		this.phone = phone;
		setPets(pets);
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
	
	
	public String getPhone() {
		return phone;
	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Pet[] getPets() {
		return pets;
	}
	
	
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	
	
	@Override
	public String toString() {
		
		String s ="\nName: "+getName()+
		"\nAddress: "+getAddress() +
		"\nPhone number: "+getPhone();
		
		s+="\nThe owners pets: \n";
		
		/* Loops through the array of pets (the member variable) and
		 * calls the toString() on each, appending to the 's' String. */
		
		for(Pet p : pets){
			s+=p.toString() + "\n";
			
		}
		return s;
		/*return "\n Owner name: " + name + 
				"\n Address: " + address + 
				"\n Phone: " + phone +
				"\n pets: " + Arrays.toString(pets);*/
	} 
	
	
	
	
}
