/*
 * Class: CMSC203 30339
 * Instructor: Dr. Grinberg
 * Assignment 1
 * Description: Patient
 * Due: 2/26/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: A
*/
import java.util.Date;


public class Patient 
{
	 public static void main(String[] args) {
	    	
	    }
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactNumber;
   
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
    }
	
	
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
	
}

class Procedure {
    private String procedureName;
    private Date procedureDate;
    private String practitionerName;
    private double procedureCharge;

    public Procedure(String procedureName, Date procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public Date getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(Date procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }

    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }
}

class PatientDriverApp {
    public static void main(String[] args) {
        // Create a Patient instance
        Patient patient = new Patient(
                "Cristiano", "", "Ronaldo",
                "Av. de Concha Espina, 1", "Madrid", "Spain",
                "28036", "+34 913 98 43 00",
                "Maria Dolores", "456-123-1234"
        );

        // Create three Procedure instances
        Procedure procedure1 = new Procedure(
                "Physical Exam", new Date(), "Dr. Irvine", 250.0
        );
        Procedure procedure2 = new Procedure(
                "X-ray", new Date(), "Dr. Jamison", 500.0
        );
        Procedure procedure3 = new Procedure(
                "Blood Test", new Date(), "Dr. Smith", 200.0
        );

        // Display patient information
        System.out.println("Patient Information:");
        System.out.println("Name: " + patient.getFirstName() + " " + patient.getMiddleName() + " " + patient.getLastName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("City: " + patient.getCity());
        System.out.println("State: " + patient.getState());
        System.out.println("ZIP: " + patient.getZipCode());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.getEmergencyContactName() + " " + patient.getEmergencyContactNumber());

        // Display procedure information
        System.out.println("\nProcedure Information:");
        System.out.println("Procedure #1:");
        System.out.println("Name: " + procedure1.getProcedureName());
        System.out.println("Date: " + procedure1.getProcedureDate());
        System.out.println("Practitioner: " + procedure1.getPractitionerName());
        System.out.println("Charge: " + procedure1.getProcedureCharge());

        System.out.println("\nProcedure #2:");
        System.out.println("Name: " + procedure2.getProcedureName());
        System.out.println("Date: " + procedure2.getProcedureDate());
        System.out.println("Practitioner: " + procedure2.getPractitionerName());
        System.out.println("Charge: " + procedure2.getProcedureCharge());

        System.out.println("\nProcedure #3:");
        System.out.println("Name: " + procedure3.getProcedureName());
        System.out.println("Date: " + procedure3.getProcedureDate());
        System.out.println("Practitioner: " + procedure3.getPractitionerName());
        System.out.println("Charge: " + procedure3.getProcedureCharge());

        // Calculate and display total charges
        double totalCharges = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
        System.out.println("\nTotal Charges: " + totalCharges);
        System.out.println("Student Name: Andy Cruz");
        System.out.println("MC#M21160539");
        System.out.println("Due Date: 2/26/24");
    }
}

