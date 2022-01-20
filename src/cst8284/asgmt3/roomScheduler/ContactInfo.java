package cst8284.asgmt3.roomScheduler;

import java.text.ParseException;
import java.util.IllegalFormatException;

public class ContactInfo implements java.io.Serializable{
	private String firstName, lastName, phoneNumber, organization;
	
	public ContactInfo(String firstName, String lastName, String phoneNumber) {
		this(firstName, lastName, phoneNumber, "Algonquin College");
	}	
	
	public ContactInfo(String firstName, String lastName, String phoneNumber, String organization) {
		setFirstName(firstName); setLastName(lastName); 
		setPhoneNumber(phoneNumber); setOrganization(organization);
	}	

	public void setFirstName(String firstName){
	if (firstName.contains("! && @ && # && $ && % && ^ && & && * && ( && ) && < && > && ? && / && . && ' && ,  "))
		throw new BadRoomBookingException("Name contains illegal characters","A name cannot include characters other than alphabetic characters"); 
				
	{this.firstName = firstName;}
	
	}
	
	
	public String getFirstName() {return firstName;}

	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getLastName() {return lastName;}

	public void setPhoneNumber(String phoneNumber)  {
				
	this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {return phoneNumber;}

	public void setOrganization(String organization) {this.organization = organization;}
	public String getOrganization() {return organization;}
	
	@Override
	public String toString() {
		return "Contact Information: " +
			((getFirstName()!="")?(getFirstName() + " " + getLastName()):"") + "\n" +
			"Phone: " + getPhoneNumber() +  
			((getOrganization().equals(""))?"":("\n" +getOrganization() + "\n"));
	}
}