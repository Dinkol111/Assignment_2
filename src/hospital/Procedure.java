package hospital;

public class Procedure {
private String procedureName;
private String procedureDate;
private String practitioner;
private double cost;

public Procedure() { }

public Procedure(String procedureName,String procedureDate) {
	this.procedureName = procedureName;
	this.procedureDate = procedureDate;
}

public Procedure(String procedureName,String procedureDate,String practitioner, double cost) {
	this.procedureName = procedureName;
	this.procedureDate = procedureDate;
	this.practitioner = practitioner;
	this.cost = cost;
}

public String getProcedureName() {
	return procedureName;
}

public String getProcedureDate() {
	return procedureDate;
}

public String getPractitioner() {
	return practitioner;
}

public double getCost() {
	return cost;
}

public void setProcedureName(String procedure) {
	procedureName = procedure;
}

public void setProcedureDate(String date) {
	procedureDate = date;
}

public void setPractitioner(String practitioner) {
	this.practitioner = practitioner;
}

public void setCost(double cost) {
	this.cost = cost;
}

public String toString() {
	return "\tProcedure: "+procedureName+"\n\tProcedureDate="+procedureDate+"\n\tPractitioner="+practitioner+"\n\tCharge="+cost;
}



}
