package sheet13OwnerWithPetArray;

import java.util.Arrays;

public class Owner {

	
	private String name;
	private String address;
	private String phone;
	private String[] pets;
	public Owner(String name, String address, String phone, String[] pets) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pets = pets;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the pets
	 */
	public String[] getPets() {
		return pets;
	}
	/**
	 * @param pets the pets to set
	 */
	public void setPets(String[] pets) {
		this.pets = pets;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Owner name=" + name + 
				", address=" + address + 
				", phone=" + phone +
				", pets=" + Arrays.toString(pets);
	} 
	
	
	
	
}
