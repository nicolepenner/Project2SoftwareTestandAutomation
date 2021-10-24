package info;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;

public class Appointment {
	
	//create variables needed
	String apptId;
	LocalDate apptDate;
	String apptDesc;
	
	LocalDate todaysDate = LocalDate.now();
		
	//parameters for variables
	public Appointment(String apptId, LocalDate apptDate, String apptDescription) {
		
		if(apptId == null || apptId.length() > 10) {
			throw new IllegalArgumentException("Invalid appointment ID entered");
		}
		
		if(apptDate == null || apptDate.isBefore(todaysDate)) {
			throw new IllegalArgumentException("Invalid date entered");
		}
		
		if(apptDescription == null || apptDesc.length() > 50) {
			throw new IllegalArgumentException("Invalid description entered");
		}
		
		//instances of variables
		this.apptId = apptId;
		this.apptDate = apptDate; 
		this.apptDesc = apptDesc;
	}

	//getters for variables
	public String getApptId() {
		return apptId;
	}

	public String getApptDesc() {
		return apptDesc;
	}

	public LocalDate getApptDate() {
		return apptDate;
	}

	//setters for variables
	public void setApptId(String apptId) {
		this.apptId = apptId;
	}

	public void setApptDescription(String apptDesc) {
		this.apptDesc = apptDesc;
	}

	public void setDate(LocalDate apptDate) {
		this.apptDate = apptDate;
	}
}
