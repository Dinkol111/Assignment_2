package hospital;

public class Patient {
	//name of patient, didn't want to put name in the variable
private String first,middle,last;
private String streetAddress,city,state,zip;
private String phoneNumber;
private String emergencyName,emergencyContact;

public Patient() {
	first = null;
	last = null;
	middle = null;
	streetAddress = null;
	city = null;
	state = null;
	zip = null;
	phoneNumber = null;
	emergencyName = null;
	emergencyContact = null;
}

public Patient(String first,String middle,String last) {
	this.first = first;
	this.middle = middle;
	this.last = last;
	streetAddress = null;
	city = null;
	state = null;
	zip = null;
	phoneNumber = null;
	emergencyName = null;
	emergencyContact = null;
}
public Patient(String first,String middle,String last,String streetAddress,String city,String state,String zip,String phoneNumber, String emergencyContact, String emergencyName) {
	this.first = first;
	this.middle = middle;
	this.last = last;
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.phoneNumber = phoneNumber;
	this.emergencyName = emergencyName;
	this.emergencyContact = emergencyContact;
}

public String buildFullName() {
	return " Name: "+ first+" "+middle+" "+last+"\n";
}
public String buildAddress() { 
	return " Address: "+streetAddress+" "+city+" "+state+" "+zip+"\n";
}
public String buildEmergencyContact() {
	return " EmergencyContact: "+emergencyName +" "+emergencyContact+"\n";
}
public String toString() {
	return "Patient info:\n"+buildFullName()+buildAddress()+buildEmergencyContact();
}
public String getFirstName() {
	return first;
}
public String getMiddleName() {
	return middle;
}
public String getLastName() {
	return last;
}
public String getStreetAddress() {
	return streetAddress;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public String getZip() {
	return zip;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public String getEmergencyName() {
	return emergencyName;
}
public String getEmergencyContact() {
	return emergencyContact;
}


public void setFirstName(String nam) {
	first = nam;
}
public void setMiddleName(String nam) {
	middle = nam;
}
public void setLastName(String nam) {
	last = nam;
}
public void setStreetAddress(String address) {
	streetAddress = address;
}
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public void setZip(String zip) {
	this.zip = zip;
}
public void setPhoneNumber(String number) {
	phoneNumber = number;
}
public void setEmergencyName(String emergencyName) {
	this.emergencyName = emergencyName;
}
public void setEmergencyContact(String emergencyContact) {
	this.emergencyContact = emergencyContact;
}



}
