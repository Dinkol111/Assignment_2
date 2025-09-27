/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: There is 3 classes that work to make patient and procedure objects to display information based on user input
 * Due: 9/27/2025
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Dinesh Kolla
*/

package hospital;
import java.util.*;
public class PatientDriverApp {

	public static void main(String[] args) {
		Patient p = new Patient();
		Procedure one = new Procedure();
		Procedure two = new Procedure();
		Procedure three = new Procedure();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the patient's first name?");
		p.setFirstName(input.nextLine());
		System.out.println("What is the patient's middle name?");
		p.setMiddleName(input.nextLine());
		System.out.println("What is the patient's last name?");
		p.setLastName(input.nextLine());
		System.out.println("What is the patient's street address?");
		p.setStreetAddress(input.nextLine());
		System.out.println("What is the patient's city?");
		p.setCity(input.nextLine());
		System.out.println("What is the patient's state?");
		p.setState(input.nextLine());
		System.out.println("What is the patient's zip?");
		p.setZip(input.nextLine());
		System.out.println("What is the patient's phone number?");
		p.setPhoneNumber(input.nextLine());
		System.out.println("What is the patient's emergency contact?");
		p.setEmergencyName(input.nextLine());
		System.out.println("What is the patient's emergency contact number?");
		p.setEmergencyContact(input.nextLine());
		
		
		System.out.println("What is the name of procedure one?");
		one.setProcedureName(input.nextLine());
		System.out.println("What is the date of procedure one?");
		one.setProcedureDate(input.nextLine());
		System.out.println("Who is the practitioner of procedure one?");
		one.setPractitioner(input.nextLine());
		System.out.println("What is the cost of procedure one?");
		one.setCost(input.nextDouble());
		input.nextLine();
		System.out.println("What is the name of procedure two?");
		two.setProcedureName(input.nextLine());
		System.out.println("What is the date of procedure two?");
		two.setProcedureDate(input.nextLine());
		System.out.println("Who is the practitioner of procedure two?");
		two.setPractitioner(input.nextLine());
		System.out.println("What is the cost of procedure two?");
		two.setCost(input.nextDouble());
		input.nextLine();
		System.out.println("What is the name of procedure three?");
		three.setProcedureName(input.nextLine());
		System.out.println("What is the date of procedure three?");
		three.setProcedureDate(input.nextLine());
		System.out.println("Who is the practitioner of procedure three?");
		three.setPractitioner(input.nextLine());
		System.out.println("What is the cost of procedure three?");
		three.setCost(input.nextDouble());
		
		displayPatient(p);
		displayProcedure(one);
		System.out.println();
		displayProcedure(two);
		System.out.println();
		displayProcedure(three);
		System.out.println();
		System.out.printf("Total charges: $%.2f",calculateTotalCharges(one,two,three) );
		System.out.println();
		System.out.println("Programmer name:Dinesh Kolla");
		System.out.println("M#:M21193001");
		System.out.println("Due date:9/27/2025");



		
		input.close();
	}
	
	public static void displayPatient(Patient p) {
		System.out.println(p);
	}
	public static void displayProcedure(Procedure p) {
		System.out.println(p);
	}
	public static double calculateTotalCharges(Procedure one,Procedure two, Procedure three) {
		double total = one.getCost()+two.getCost()+three.getCost();
		return total;
	}
}
